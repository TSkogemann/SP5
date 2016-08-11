(function (angular) {
    'use strict';
    angular.module('ngApp', []).controller('ngAppDemoController', function ($scope, $http) {

        $scope.fName;
        $scope.lName;
        $scope.city;
        $scope.street;
        $scope.count;
        $scope.data = 
                
                $scope.test = function(){
                    var testUrl="";
                    testUrl = "test/";
                    $http({
                        method: 'GET',
                        url: testUrl
                    }).then(function succesCallback(){
                        console.log("SuccesCallBack test");
                    }, function errorCallback(){
                        console.log("ErrorCallBack test");
                    });
                };
                
        $scope.createData = function () {

            var url = "";
            url = "adresses/" + $scope.count + '/';
                    if ($scope.fName === 1) {
                url = url + 'fname/';
            }
            if ($scope.lName === 1) {
                url = url + 'lname/';
            }
            if ($scope.city === 1) {
                url = url + 'city/';
            }
            if ($scope.street === 1) {
                url = url + 'street';
            }
            console.log(url);
            $http({
                method: 'GET',
                url: url
            }).then(function successCallback(response) {
                console.log("SuccesCallBack createData");
                $scope.data = response.data;
            }, function errorCallback(response) {
                console.log("errorCallBack createData");
            });
        };
    });
})(window.angular);