(function ($app) {
    angular.module('custom.controllers', []);
    
    app.controller('HomeController', ['$scope', '$http', '$rootScope', '$state', '$translate', 'Notification', function ($scope, $http, $rootScope, $state, $translate, Notification) {
      
      app.registerEventsCronapi($scope, $translate);
        
      $rootScope.http = $http;
      $rootScope.Notification = Notification;

      $scope.message = {};
      
      $scope.pesquisar = function() {
        $rootScope.nomePesquisado = $scope.query;
        $state.go("resultado");
      }

      $rootScope.session = (sessionStorage._u) ? JSON.parse(sessionStorage._u) : null;
      
    }]);
    
    app.controller('ResultadoController', ['$scope', '$http', '$rootScope','$state', 'Notification', function ($scope, $http, $rootScope, $state, Notification) {
      
      var vm = $scope;
      if (typeof($rootScope.nomePesquisado) === "undefined")
      {
        vm.nome = "|";
      }
      else
      {
        vm.nome = $rootScope.nomePesquisado;  
      }
      
      $scope.selecionar = function() {
        $rootScope.idSelecionado = Pessoa.active.id;
        $state.go("detalhe");
      }
      
      vm.inserting = false;
      
      vm.mercadorias = [];
      vm.negocio = "";
      $http({
                 method: 'GET',
                 url: '/api/rest/app/Mercadoria',
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                for (var i = 0; i < data.content.length; i++)
                {
                  vm.mercadorias.push(data.content[i]); 
                }
             });
      
      vm.startInserting = function () {
        vm.inserting = true;
      }
      
      vm.post = function (id, tipo, nome, quantidade, preco, negocio) {
        var mercadoria = {
          id: id,
          tipo: tipo,
          nome: nome,
          quantidade: quantidade,
          preco: preco,
          negocio: vm.negocio
        }
        $http({
                 method: 'POST',
                 url: '/api/rest/app/Mercadoria',
                 data : mercadoria,
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                 vm.mercadorias.push(data);
                 vm.cancel();
                 vm.inserting = false;
             }).error(function () {
                 vm.cancel();
                 Notification.error('Erro ao executar a operação');
             });
      }
      
      vm.cancel = function () {
        $scope.id = "";
        $scope.tipo = "";
        $scope.nome = "";
        $scope.quantidade = "";
        $scope.preco = "";
        $scope.negocio = "";
        vm.inserting = false;
      }
      
      $scope.configuraNegocio = function (negocio) {
         vm.negocio = negocio;
      }

    }]);
    
    app.controller('DetalheController', ['$scope', '$http', '$rootScope','$state', 'Notification', function ($scope, $http, $rootScope, $state, Notification) {
      
      var vm = $scope;
      if (typeof($rootScope.nomePesquisado) === "undefined")
      {
        vm.nome = "|";
      }
      else
      {
        vm.nome = $rootScope.nomePesquisado;  
      }
      vm.inserting = false;
      
      vm.mercadorias = [];
      vm.negocio = "";
      $http({
                 method: 'GET',
                 url: '/api/rest/app/Mercadoria',
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                for (var i = 0; i < data.content.length; i++)
                {
                  vm.mercadorias.push(data.content[i]); 
                }
             });
      
      $scope.selecionar = function() {
        $rootScope.nomePesquisado = $scope.query;
        $state.go("resultado");
      }
      
      vm.startInserting = function () {
        vm.inserting = true;
      }
      
      vm.post = function (id, tipo, nome, quantidade, preco, negocio) {
        var mercadoria = {
          id: id,
          tipo: tipo,
          nome: nome,
          quantidade: quantidade,
          preco: preco,
          negocio: vm.negocio
        }
        $http({
                 method: 'POST',
                 url: '/api/rest/app/Mercadoria',
                 data : mercadoria,
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                 vm.mercadorias.push(data);
                 vm.cancel();
                 vm.inserting = false;
             }).error(function () {
                 vm.cancel();
                 Notification.error('Erro ao executar a operação');
             });
      }
      
      vm.cancel = function () {
        $scope.id = "";
        $scope.tipo = "";
        $scope.nome = "";
        $scope.quantidade = "";
        $scope.preco = "";
        $scope.negocio = "";
        vm.inserting = false;
      }
      
      $scope.configuraNegocio = function (negocio) {
         vm.negocio = negocio;
      }

    }]);
    
    app.controller('MercadoriaController', ['$scope', '$http', '$state', 'Notification', function ($scope, $http, $state, Notification) {
      
      var vm = $scope;
      
      vm.inserting = false;
      
      vm.mercadorias = [];
      vm.negocio = "";
      $http({
                 method: 'GET',
                 url: '/api/rest/app/Mercadoria',
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                for (var i = 0; i < data.content.length; i++)
                {
                  vm.mercadorias.push(data.content[i]); 
                }
             });
      
      vm.startInserting = function () {
        vm.inserting = true;
      }
      
      vm.post = function (id, tipo, nome, quantidade, preco, negocio) {
        var mercadoria = {
          id: id,
          tipo: tipo,
          nome: nome,
          quantidade: quantidade,
          preco: preco,
          negocio: vm.negocio
        }
        $http({
                 method: 'POST',
                 url: '/api/rest/app/Mercadoria',
                 data : mercadoria,
                 headers: {
                     'Content-Type' : 'application/json'
                 }
             }).success(function (data) {
                 vm.mercadorias.push(data);
                 vm.cancel();
                 vm.inserting = false;
             }).error(function () {
                 vm.cancel();
                 Notification.error('Erro ao executar a operação');
             });
      }
      
      vm.cancel = function () {
        $scope.id = "";
        $scope.tipo = "";
        $scope.nome = "";
        $scope.quantidade = "";
        $scope.preco = "";
        $scope.negocio = "";
        vm.inserting = false;
      }
      
      $scope.configuraNegocio = function (negocio) {
         vm.negocio = negocio;
      }

    }]);
} (app));