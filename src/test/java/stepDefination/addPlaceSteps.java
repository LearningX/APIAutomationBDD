package stepDefination;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResource;
import resources.TestDataBuild;

public class addPlaceSteps extends BaseClass{


	RequestSpecification reqstSpec;
	ResponseSpecification respSpec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	static String place_id;

	@Given("Add Place Payload with {string} {string} {string}")

	public void addPlacePayloadWithData(String name, String language, String address) throws IOException {

		reqstSpec = given().spec(requestSpecification()).body(data.addPlacePayLoad(name,language,address));
	}

	@When("user calls {string} with {string} http request")
	public void userCallsHttpRequest(String resource, String method) {
		APIResource resourceAPI = APIResource.valueOf(resource); // valueOf method is to call constructor of API resource
		System.out.println(resourceAPI.getResource());		// method required from getResource method  

		if(method.equalsIgnoreCase("POST"))
			response = reqstSpec.when().post(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("DELETE"))
			response = reqstSpec.when().delete(resourceAPI.getResource());
	}

	@Then("API call got success with status code {string}")
	public void apiCallSuccessWithStatusCode(String successCode) {
		assertEquals(String.valueOf(response.getStatusCode()), successCode);
	}

	@Then("{string} in response is {string}")
	public void getResponseOk(String key, String value) {
		assertEquals(getJsonPath(response, key), value);
	}

	@Then("verify place_ID created maps to {string} using {string}")
	public void verifyPlaceIDCreatedMapsToUsingGetMethod(String expectedName, String resource) throws IOException {

		place_id = getJsonPath(response, "place_id");
		reqstSpec = given().spec(requestSpecification()).queryParam("place_id", "place_id");
		userCallsHttpRequest(resource,"GET");
		String actualName = getJsonPath(response, "name");
		//String actualName = getJsonPath(response, "name");
		assertEquals(actualName, expectedName);

	}


}
