/*
var controllers = angular.module('NewsAutomation');
controllers.controller('templatepageCtrl', ['$scope','$cookies', function($scope,$cookies) {
    var storedVal = $cookies.getObject('results');
    //console.log(storedVal);
    angular.forEach($scope.data, function(item) {
        $scope.template1 = 'Hello From Controller' + storedVal.ewind;
    });
}]);
*/

(
    function()
    {
        //var app = angular.module("NewsAutomation",[]);
        var app = angular.module("NewsAutomation");
        var templateController = function($scope, NewsEventsService,$window,$location,$cookies) {
            var storedVal = $cookies.getObject('results');
            //console.log(storedVal);

            $scope.myoptions = [
                {value: '1', label: 'Template 1'},
                {value: '2', label: 'Template 2'}
            ];

            $scope.PopulateEvent = function(userChoice)
            {

                if(userChoice==1) {
                    angular.forEach(storedVal, function (item) {
                        $('.editable').html('Last Sunday was the  ' + storedVal.eName + ' brought to you by ' + storedVal.esponsor1 + ' and ' + storedVal.esponsor2 + '<br/><br/> ' +
                            storedVal.eraceIntro + ' <br/><br/> ' +
                            storedVal.eoverallFemaleCourse1 + ' won the ' + storedVal.ecourse1 + ' in an ' + storedVal.eoverallFemaleCourse1Craft + ' followed by '  + storedVal.eoverallFemaleCourse1 + ' , ' + storedVal.ethirdOverallFemaleCourse1 + '.  ' +  storedVal.ethirdOverallMaleCourse1 + ' took the win in the ' + storedVal.egender + ' event with a time of ' + storedVal.eoverallMaleCourse1Time + ' followed by ' + storedVal.esecondOverallMaleCourse1 + ' with a time of ' + storedVal.esecondOverallMaleCourse1Time + ' respectively. '
                            +  '<br/><br/> For full results check out: ' + storedVal.eresultsURL
                            + '<br/><br/> Special thanks to the entire team at ' + storedVal.eName  + ' for supporting such a great cause and to learn more please click "contact race” on the ' + storedVal.epGRaceURL);

                    });
                }
                if(userChoice==2) {
                    angular.forEach(storedVal, function (item) {
                        $('.editable').html(storedVal.esponsor1 + ' and ' + storedVal.esponsor2 + ' hosted ' + storedVal.eName + ',' +  ' this last weekend on ' + storedVal.eraceDate +'. <br/><br/> ' +
                            storedVal.eraceIntro +
                            '<br/><br/>  This ' + storedVal.eseason + ' event included ' + storedVal.eName + ' different events. Categories included ' + storedVal.ecourse1AgeGroups + ' and ' + storedVal.ecourse1CraftTypes +'. <br/><br/>' +
                            ' The conditions were ' + storedVal.ewind + ' wind, ' + storedVal.etemp +', ' + storedVal.esky +  ' and ' + storedVal.esurf + ' surf. <br/><br/>' +
                            ' Additionally the pros were competing for an ' + storedVal.epurse + ' purse, along with prizes for the other divisions. <br/><br/>' +
                            storedVal.eoverallMaleCourse1 + ' and ' + storedVal.eoverallFemaleCourse1 + ' made their marks on the event with times of ' + storedVal.eoverallMaleCourse1Time + ' and ' + storedVal.eoverallFemaleCourse1Time + ' respectively. ' + storedVal.eoverallMaleCourse1 + ' edged out ' + storedVal.esecondOverallMaleCourse1 + ' for the top spot and the ' + storedVal.ecourse1 + ' saw great efforts from ' + storedVal.ethirdOverallMaleCourse1 +  ' and ' + storedVal.ethirdOverallFemaleCourse1 + ' in a ' + storedVal.ethirdOverallFemaleCourse1Craft +'. <br/><br/>' +
                            ' For full results: ' + storedVal.eresultsURL +
                            ' <br/><br/> Special thanks to the entire ' + storedVal.eName + ' team for running such an amazing event. <br/><br/>' +
                            '<ul><li> Event photos were shot by ' + storedVal.ephotographerName + ' the that can be found here ' + storedVal.ephotoURL + '.</li> <br/>'+
                        ' <li>Live replay can be found here ' +storedVal.ereplayURL+
                        ' </li><br/><li> Live stream can be found here ' + storedVal.estreamURL +
                        '​ </li></ul> For more info please check out out or ' + storedVal.epGRaceURL + ' and ' + storedVal.ewebsiteURL + ' and don’t forget to sign up early next year’s event!! <br/>');

                    });
                }
            }
        };
        app.controller("templatepageCtrl", templateController,['$window']);
    }()
);