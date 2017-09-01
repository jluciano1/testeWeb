var app = (function() {
  return angular.module('MercadoriaApp', [
      'ui.router',
      'ui.select',
      'ui-select-infinity',
      'ngResource',
      'ngSanitize',
      'custom.controllers',
      'custom.services',
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
      $stateProvider.state('index', {
          url: "",
          controller: 'MercadoriaController',
          templateUrl: 'views/mercadoria.html'
        })

        .state('404', {
          url: "/error/404",
          controller: 'MercadoriaController',
          templateUrl: function(urlattr) {
            return 'views/error/404.view.html';
          }
        });

      $urlRouterProvider.otherwise("/error/404");
    })

}(window));