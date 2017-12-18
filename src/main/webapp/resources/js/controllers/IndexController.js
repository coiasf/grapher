'use strict';

/**
 * IndexController
 * @constructor
 */
var IndexController = function($scope, $http) {
	console.log("ceva");
    $scope.getConnection = function() {
    	console.log("ceva");
        $http.get('ldap/connect').success(function(connectionResponse){
            $scope.response = connectionResponse;
        });
    }
}