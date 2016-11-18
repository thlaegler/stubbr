# Generated with Stubbr
# The Cucumber feature definition for Login As User I want to log-in to internal Area.

Scenarios:
<ul>
<li>UnregisteredUserCantLogin - As not-registered User I can't log-in</li>
<li>WrongPasswordCantLogin - As registered User I can't log-in when password is wrong</li>
<li>RegisteredUserCanLogin - As not-registered User I can't log-in</li>
</ul>
# {{{Version: 0.0.1-SNAPSHOT}}}
# {{{Date: 16.11.2016 - 15:09:38}}}
# language: en
Feature: Login - As User I want to log-in to internal Area.

Scenario: UnregisteredUserCantLogin - As not-registered User I can't log-in
	Given Tester2
	When Tester2 opens  LoginScreen
	When Tester2 enters "tester2" Benutzername
	When Tester2 enters "rightPassword" Passwort
	Then LoginFailed should opens  
	
Scenario: WrongPasswordCantLogin - As registered User I can't log-in when password is wrong
	Given Tester1
	When Tester1 opens  LoginScreen
	When Tester1 enters "tester1" Benutzername
	When Tester1 enters "wrongPassword" Passwort
	Then LoginSuccessful should opens  
	
Scenario: RegisteredUserCanLogin - As not-registered User I can't log-in
	Given Tester1
	When Tester1 opens  LoginScreen
	When Tester1 enters "tester1" Benutzername
	When Tester1 enters "rightPassword" Passwort
	Then LoginSuccessful should opens  
	
