package stepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APISteps {

	String baseUrl  = "https://boratech.herokuapp.com";
	@Given("I am authorized user")

	public void i_am_authorized_user() {
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response httpResponse = httpRequest.request(Method.GET, "/api/profile/user/5e19e187f503b4001767c6d8");

		int statusCode = httpResponse.getStatusCode();
		String body = httpResponse.getBody().asString();
		// System.out.println("Status Code: " + statusCode);
		System.out.println("Body: " + body);

		System.out.println();

	}

}
