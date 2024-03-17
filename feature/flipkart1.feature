Feature: test flipkart login

		Scenario Outline: flipkart login testing
		
		Given i launch google chrome browser
		When i open the flipkart homepage
		And user clicks on login button
		Then give the "<PhNumber>"
		Then click on request otp btn
		
Examples:
| PhNumber |
| 9398266874 |
		