var app = (function() {

  return angular.module('MyApp', [
      'ui.router',
      'ui.select',
      'ui-select-infinity',
      'ngResource',
      'ngSanitize',
      'custom.controllers',
      'datasourcejs',
      'chart.js',
      'ngMask',
      'ngJustGage',
      'pascalprecht.translate',
      'tmh.dynamicLocale',
      'ui-notification',
      'ui.bootstrap',
      'ngFileUpload'
    ])

    .constant('LOCALES', {
      'locales': {
        'pt_br': 'Portugues (Brasil)',
        'en_us': 'English'
      },
      'preferredLocale': 'pt_br'
    })
    .config(function($stateProvider, $urlRouterProvider, NotificationProvider) {
      NotificationProvider.setOptions({
        delay: 5000,
        startTop: 20,
        startRight: 10,
        verticalSpacing: 20,
        horizontalSpacing: 20,
        positionX: 'right',
        positionY: 'top'
      });

      // Set up the states
      $stateProvider

        .state('login', {
          url: "",
          controller: 'HomeController',
          templateUrl: 'views/home.view.html'
        })

        .state('main', {
          url: "/",
          controller: 'HomeController',
          templateUrl: 'views/home.view.html'
        })

        .state('home', {
          url: "/home",
          controller: 'HomeController',
          templateUrl: 'views/home.view.html'
        })
        
        .state('resultado', {
          url: "/resultado",
          controller: 'ResultadoController',
          templateUrl: 'views/resultado.html'
        })
        
        .state('detalhe', {
          url: "/detalhe",
          controller: 'DetalheController',
          templateUrl: 'views/detalhe.html'
        })

        .state('home.pages', {
          url: "/{name:.*}",
          controller: 'PageController',
          templateUrl: function(urlattr) {
            return 'views/' + urlattr.name + '.view.html';
          }
        })

        .state('404', {
          url: "/error/404",
          controller: 'PageController',
          templateUrl: function(urlattr) {
            return 'views/error/404.view.html';
          }
        })

        .state('403', {
          url: "/error/403",
          controller: 'PageController',
          templateUrl: function(urlattr) {
            return 'views/error/403.view.html';
          }
        });

      // For any unmatched url, redirect to /state1
      $urlRouterProvider.otherwise("/error/404");
    })

    .config(function($translateProvider, tmhDynamicLocaleProvider) {

      $translateProvider.useMissingTranslationHandlerLog();

      $translateProvider.useStaticFilesLoader({
        prefix: 'i18n/locale_',
        suffix: '.json'
      });

      $translateProvider.registerAvailableLanguageKeys(
        ['pt_br', 'en_us'], {
          'en*': 'en_us',
          'pt*': 'pt_br',
          '*': 'pt_br'
        }
      );

      var locale = (window.navigator.userLanguage || window.navigator.language || 'pt_br').replace('-', '_');

      $translateProvider.use(locale.toLowerCase());
      $translateProvider.useSanitizeValueStrategy('escaped');

      tmhDynamicLocaleProvider.localeLocationPattern('plugins/angular-i18n/angular-locale_{{locale}}.js');
    })

    .directive('crnValue', ['$parse', function($parse) {
      return {
        restrict: 'A',
        require: '^ngModel',
        link: function(scope, element, attr, ngModel) {
          var evaluatedValue;
          if (attr.value) {
            evaluatedValue = attr.value;
          } else {
            evaluatedValue = $parse(attr.crnValue)(scope);
          }
          element.attr("data-evaluated", JSON.stringify(evaluatedValue));
          element.bind("click", function(event) {
            scope.$apply(function() {
              ngModel.$setViewValue(evaluatedValue);
            }.bind(element));
          });
        }
      };
    }])

    // General controller
    .controller('PageController', ["$scope", "$stateParams", "$location", "$http", "$rootScope", "$translate", function($scope, $stateParams, $location, $http, $rootScope, $translate) {

      app.registerEventsCronapi($scope, $translate);

      // save state params into scope
      $scope.params = $stateParams;
      $scope.$http = $http;

      // Query string params
      var queryStringParams = $location.search();
      for (var key in queryStringParams) {
        if (queryStringParams.hasOwnProperty(key)) {
          $scope.params[key] = queryStringParams[key];
        }
      }

      //Components personalization jquery
      $scope.registerComponentScripts = function() {
        //carousel slider
        $('.carousel-indicators li').on('click', function() {
          var currentCarousel = '#' + $(this).parent().parent().parent().attr('id');
          var index = $(currentCarousel + ' .carousel-indicators li').index(this);
          $(currentCarousel + ' #carousel-example-generic').carousel(index);
        });
      }

      $scope.registerComponentScripts();
    }])

    .run(function($rootScope, $state) {
      $rootScope.$on('$stateChangeError', function() {
        if (arguments.length >= 6) {
          var requestObj = arguments[5];
          if (requestObj.status === 404 || requestObj.status === 403) {
            $state.go(requestObj.status.toString());
          }
        } else {
          $state.go('404');
        }
      });
    });

}(window));

app.userEvents = {};

app.userEvents.carregaGraficos = function(event) {
	event.$scope.$parent.$parent.datasNasc = [];
	event.$scope.$parent.$parent.datasNascQtde = [];
	event.$scope.$parent.$parent.ratings = [];
	event.$scope.$parent.$parent.ratingsQtde = [];
	event.$scope.$parent.$parent.amigos = [];
	event.$scope.$parent.$parent.amigosQtde = [];
	for (var i = 0; i < Pessoa.data.length; i++)
	{
	  if (Pessoa.data[i].dtNascimento !== null && Pessoa.data[i].dtNascimento !== undefined)
	  {
	    var ano = Pessoa.data[i].dtNascimento.toString().substring(0,4);
	    var present = false;
	    var indicePresent = false;
	    for (var j = 0; j < event.$scope.$parent.$parent.datasNasc.length; j++)
	    {
	      if (event.$scope.$parent.$parent.datasNasc[j] === ano)
	      {
	        present = true;
	        indicePresent = j;
	      }
	    }
	    if (!present)
	    {
	      event.$scope.$parent.$parent.datasNasc.push(ano);  
	      event.$scope.$parent.$parent.datasNascQtde.push(1);
	    }
	    else
	    {
	      event.$scope.$parent.$parent.datasNascQtde[indicePresent]++;
	    }
	  }
	  if (Pessoa.data[i].dadoPessoalSerasa.ratingPessoal !== null && Pessoa.data[i].dadoPessoalSerasa.ratingPessoal !== undefined)
	  {
	    var rating = Pessoa.data[i].dadoPessoalSerasa.ratingPessoal;
	    var present = false;
	    var indicePresent = false;
	    for (var j = 0; j < event.$scope.$parent.$parent.ratings.length; j++)
	    {
	      if (event.$scope.$parent.$parent.ratings[j] === rating)
	      {
	        present = true;
	        indicePresent = j;
	      }
	    }
	    if (!present)
	    {
	      event.$scope.$parent.$parent.ratings.push(rating);  
	      event.$scope.$parent.$parent.ratingsQtde.push(1);
	    }
	    else
	    {
	      event.$scope.$parent.$parent.ratingsQtde[indicePresent]++;
	    }
	  }
	  if (Pessoa.data[i].dadoPessoalFacebook.quantAmigo !== null && Pessoa.data[i].dadoPessoalFacebook.quantAmigo !== undefined)
	  {
	    var qtde = Pessoa.data[i].dadoPessoalFacebook.quantAmigo;
	    var present = false;
	    var indicePresent = false;
	    for (var j = 0; j < event.$scope.$parent.$parent.amigos.length; j++)
	    {
	      if (event.$scope.$parent.$parent.amigos[j] === qtde)
	      {
	        present = true;
	        indicePresent = j;
	      }
	    }
	    if (!present)
	    {
	      event.$scope.$parent.$parent.amigos.push(qtde);  
	      event.$scope.$parent.$parent.amigosQtde.push(1);
	    }
	    else
	    {
	      event.$scope.$parent.$parent.amigosQtde[indicePresent]++;
	    }
	  }
	}
}

//Configuration
app.config = {};

window.safeApply = function(fn) {
  var phase = this.$root.$$phase;
  if(phase == '$apply' || phase == '$digest') {
    if(fn && (typeof (fn) === 'function')) {
      fn();
    }
  }
  else {
    this.$apply(fn);
  }
};