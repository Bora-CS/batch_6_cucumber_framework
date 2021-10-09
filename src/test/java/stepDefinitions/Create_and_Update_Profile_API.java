package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_and_Update_Profile_API {
	public static void main(String[] args) {
		
		//Specifying Base URL/ URI of web service
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		
		//Creating a client with Rest Assured
		RequestSpecification httpRequest = RestAssured.given();
		Map<String,String> headers = new HashMap<String, String>();
		headers.put("Contnent-Type", "application/json");
		httpRequest.headers(headers);
		
		String requestBody = "{\"email\": \"killingEm@yahoo.com\", \"password\": \"Doggo\"}";
	
	//	httpRequest.body("{\r\n" + 
	//			"	\"name\": \"John Wick" + 
	//			"	\"email\": \"killingEm@yahoo.com\",\n" + 
	//			"	\"password\": \"Doggo"\n" + 
	//			"}");
		
		httpRequest.body(requestBody);
		
		Response httpResponse = httpRequest.request(Method.POST, "/api/auth");
		int statusCode = httpResponse.getStatusCode();
		String responseBody = httpResponse.getBody().asString();
		System.out.println("Status Code: " + statusCode + ", Body: " + responseBody);
			
		
	}
}
