# language: en

Feature: Random Feature

	Scenario: Add new Random - New Random successfully added. 
		Expecting HTTP status code: 201
		Given a consumer authenticated with "oauth2" method "oauth_password" flow "password" scope "user"
		When the consumer does "POST" on "http://localhost:8080/example/rest/foos"
		And the request content type is "application/json"
		And the request body is ""
		Then the endpoint should answer with a response
		And the response HTTP code should be 201
		And the response content type should be "application/json"
		And the response body should be ""
	
	Scenario: Add new Random - Invalid Random supplied. 
		Expecting HTTP status code: 400
		Given a consumer authenticated with "oauth2" method "oauth_password" flow "password" scope "user"
		When the consumer does "POST" on "http://localhost:8080/example/rest/foos"
		And the request content type is "application/json"
		And the request body is ""
		Then the endpoint should answer with a response
		And the response HTTP code should be 400
		And the response content type should be "application/json"
		And the response body should be ""
