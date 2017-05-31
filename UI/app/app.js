'use strict';

// Declare app level module which depends on views, and components
angular.module('NewsAutomation', [
  'ngRoute',
  'myApp.version',
    'ngCookies'
]).

    config(function($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'Views/home.view.html',
                controller: 'homepageCtrl'
            })
            .when('/template', {
                templateUrl: 'Views/template.view.html',
                controller: 'templatepageCtrl'
            })
            .otherwise({
                redirectTo: 'Views/home.view.html'
            });

});



