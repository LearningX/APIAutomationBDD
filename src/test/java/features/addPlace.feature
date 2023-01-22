Feature: Validating Place API

@Regression
Scenario Outline: Verify place is being successfully added

			Given Add Place Payload with "<name>" "<language>" "<address>"
			When user calls "addPlaceAPI" with "POST" http request
			Then API call got success with status code "200"
			And "status" in response is "OK"
			And "scope" in response is "APP"
			And verify place_ID created maps to "<name>" using "getPlaceAPI" 
			
			Examples:
			|name|language|address|
			|Deepak|Hindi|Delhi|
