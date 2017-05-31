(function () {
    'use strict';

    angular
        .module('NewsAutomation') //app name
        .factory('NewsEventsService', UserService);

    UserService.$inject = ['$http'];
    function UserService($http) {
        var service = {};

        service.GetAllEventsName = GetAllEventsName;
        service.GetEventsById = GetEventsById;

        return service;

        function GetAllEventsName() {
            return $http.get('http://localhost:8080/NewsAutomation/NewsAutomation/NewsAutomationService/Events').then(handleSuccess, handleError('Error getting all Events'));
        }

        function GetEventsById(id) {
            return $http.get('http://localhost:8080/NewsAutomation/NewsAutomation/NewsAutomationService/news?EventID=' + id).then(handleSuccess, handleError('Error getting Events by id'));
        }

        // private functions

        function handleSuccess(res) {
            return res.data;
        }

        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }

})();