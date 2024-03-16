Feature: test google homepage

		Scenario: google homepage testing
		
		Given i launch google chrome browser
		When i open google homepage
		Then google homepage displayed
		And google search button is present
		And user serach for ipl
		