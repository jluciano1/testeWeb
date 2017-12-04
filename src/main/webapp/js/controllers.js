(function ($app) {
    angular.module('custom.controllers', []);
    
    app.controller('HomeController', ['$scope', '$http', '$rootScope', '$state', '$translate', 'Notification', function ($scope, $http, $rootScope, $state, $translate, Notification) {
      
      $rootScope.http = $http;
      $rootScope.Notification = Notification;

      $scope.message = {};
      
      $scope.pesquisar = function() {
        sessionStorage.setItem("nomePesquisado", $scope.query);
        $state.go("resultado");
      }

      $rootScope.session = (sessionStorage._u) ? JSON.parse(sessionStorage._u) : null;
      
    }]);
    
    app.controller('ResultadoController', ['$scope', '$http', '$rootScope','$state', 'Notification', function ($scope, $http, $rootScope, $state, Notification) {
      
      var vm = $scope;
      if (typeof(sessionStorage.nomePesquisado) === "undefined")
      {
        vm.nome = "|";
      }
      else
      {
        vm.nome = sessionStorage.nomePesquisado;  
      }
      
      $scope.selecionar = function(id) {
        sessionStorage.setItem("idSelecionado", id);
        $state.go("detalhe");
      }
      
      $scope.voltar = function() {
        $state.go("home");
      }

    }]);
    
    app.controller('DetalheController', ['$scope', '$http', '$rootScope','$state', 'Notification', function ($scope, $http, $rootScope, $state, Notification) {
      
     var vm = $scope;
      if (typeof(sessionStorage.idSelecionado) === "undefined")
      {
        vm.idSelecionado = 0;
      }
      else
      {
        vm.idPessoa = sessionStorage.idSelecionado;  
      }
      
      $scope.voltar = function() {
        $state.go("resultado");
      }

    }]);
} (app));