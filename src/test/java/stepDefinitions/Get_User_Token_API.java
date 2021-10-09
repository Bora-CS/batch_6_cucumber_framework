package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_User_Token_API {
	public static void main(String[] args) {

		// Specifying Base URL/ URI of web service
		RestAssured.baseURI = "https://boratech.herokuapp.com";

		// Creating a client with Rest Assured
		RequestSpecification httpRequest = RestAssured.given();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Contnent-Type", "application/json");
		headers.put("x-auth-token", remappingFunction);
		httpRequest.headers(headers);

		String requestBody = "{\"email\": \"killingEm@yahoo.com\", \"password\": \"RIPdoggoRIPwifey\"}";
		httpRequest.body(requestBody);

		Response httpResponse = httpRequest.request(Method.POST, "/api/auth");
		int statusCode = httpResponse.getStatusCode();
		String responseBody = httpResponse.getBody().asString();
		System.out.println("Status Code: " + statusCode + ", Body: " + responseBody);
	}
}
