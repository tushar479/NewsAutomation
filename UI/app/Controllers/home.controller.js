(
    function()
    {
        //var app = angular.module("NewsAutomation",[]);
        var app = angular.module("NewsAutomation");
        var homeController = function($scope, NewsEventsService,$window,$location,$cookies){
            $scope.Events = [];
            $scope.responseObj = [];
            var onFetchError = function(message){
                $scope.error = "Error Fetching Events. Message:" +message;
            };
            var onFetchCompleted = function(data){
                $scope.Events =data;
            };
            var getEvents = function(){
                NewsEventsService.GetAllEventsName().then(onFetchCompleted,onFetchError);
            };
            getEvents();
            $scope.PopulateEventDetails = function(userChoice)
            {
                NewsEventsService.GetEventsById(userChoice).then
                (
                    function(result)
                    {
                        var item = result[0];
                        //console.log(item);
                        $scope.responseObj = {};

                        $scope.responseObj.eName = item.eventName;
                        $scope.responseObj.eID = item.eventID;
                        $scope.responseObj.ecity = item.city;
                        $scope.responseObj.ecourse1 = item.course1;
                        $scope.responseObj.ecourse1AgeGroups = item.course1AgeGroups;
                        $scope.responseObj.ecourse1CraftTypes = item.course1CraftTypes;
                        $scope.responseObj.ecourse2 = item.course2;
                        $scope.responseObj.eevent = item.event;
                        $scope.responseObj.efourthOverallFemaleCourse1 = item.fourthOverallFemaleCourse1;
                        $scope.responseObj.egender = item.gender;
                        $scope.responseObj.eoverallFemaleCourse1 = item.overallFemaleCourse1;
                        $scope.responseObj.eoverallFemaleCourse1Craft = item.overallFemaleCourse1Craft;
                        $scope.responseObj.eoverallFemaleCourse1Time = item.overallFemaleCourse1Time;
                        $scope.responseObj.eoverallMaleCourse1 = item.overallMaleCourse1;
                        $scope.responseObj.eoverallMaleCourse1Craft = item.overallMaleCourse1Craft;
                        $scope.responseObj.eoverallMaleCourse1Time = item.overallMaleCourse1Time;
                        $scope.responseObj.eparticipant = item.participant;
                        $scope.responseObj.epGRaceURL = item.pGRaceURL;
                        $scope.responseObj.ephotographerName = item.photographerName;
                        $scope.responseObj.ephotoURL = item.photoURL;
                        $scope.responseObj.epurse = item.purse;
                        $scope.responseObj.erace_Page_URL = item.race_Page_URL;
                        $scope.responseObj.eraceDate = item.raceDate;
                        $scope.responseObj.eraceIntro = item.raceIntro;
                        $scope.responseObj.ereplayURL = item.replayURL;
                        $scope.responseObj.eresultsURL = item.resultsURL;
                        $scope.responseObj.eseason = item.season;
                        $scope.responseObj.esecondndOverallMaleCourse1Craft = item.secondndOverallMaleCourse1Craft;
                        $scope.responseObj.esecondOverallFemaleCourse1 = item.secondOverallFemaleCourse1;
                        $scope.responseObj.esecondOverallFemaleCourse1Craft = item.secondOverallFemaleCourse1Craft;
                        $scope.responseObj.esecondOverallMaleCourse1 = item.secondOverallMaleCourse1;
                        $scope.responseObj.esecondOverallMaleCourse1Time = item.secondOverallMaleCourse1Time;
                        $scope.responseObj.esky = item.sky;
                        $scope.responseObj.esponsor1 = item.sponsor1;
                        $scope.responseObj.esponsor2 = item.sponsor2;
                        $scope.responseObj.estate = item.state;
                        $scope.responseObj.estreamURL = item.streamURL;
                        $scope.responseObj.esurf = item.surf;
                        $scope.responseObj.etemp = item.temp;
                        $scope.responseObj.ethirdOverallFemaleCourse1 = item.thirdOverallFemaleCourse1;
                        $scope.responseObj.ethirdOverallFemaleCourse1Craft = item.thirdOverallFemaleCourse1Craft;
                        $scope.responseObj.ethirdOverallMaleCourse1 = item.thirdOverallMaleCourse1;
                        $scope.responseObj.ewebsiteURL = item.websiteURL;
                        $scope.responseObj.ewind = item.wind;
                        
                        $cookies.putObject('results',$scope.responseObj);
                        //var storedVal = $cookies.getObject('results');
                        //console.log($cookies.getAll())

                    },
                    function(result)
                    {
                        alert("Error: No Data returned");
                    }
                );
            };
            $scope.redirect = function(){
                //$window.location.href = 'Views/template.view.html'
                $location.path('/template');

            }
    };


    app.controller("homepageCtrl", ['$scope', 'NewsEventsService','$window','$location','$cookies',homeController]);
    }()
);