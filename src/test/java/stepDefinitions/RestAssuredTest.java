package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	public static void main(String[] args) {
	
//		//Specifying the Base URL/URI of the Web Service
//		RestAssured.baseURI = "https://boratech.herokuapp.com";
//		
//		//Creating client with Rest Assured
//		RequestSpecification httpRequest  = RestAssured.given();
//		
//		Map<String, String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "application/json");
//		
//		httpRequest.headers(headers);
//		String requestBody = "{\"email\":\"john.Wick@test.com\", \"password\": \"Test123\" }";
//		httpRequest.body(requestBody);
//		
//		 Response httpResponse = httpRequest.request(Method.POST, "/api/auth");
//		 int statusCode = httpResponse.getStatusCode();
//		 String responseBody = httpResponse.getBody().asString();
//		 System.out.println("status Code : " + statusCode);
//		 System.out.println("Response Body: " + responseBody);
		 
//		httpRequest.headers(headers);
//	
//		httpRequest.body("{\r\n"
//				+ "	\"name\": \"John Wick\",\r\n"
//				+ "	\"email\": \"john.Wick@test.com\",\r\n"
//				+ "	\"password\": \"Test123\"\r\n"
//				+ "}");
//		Response httpResponse = httpRequest.request(Method.POST, "/api/users");
//		int statuCode = httpResponse.getStatusCode();
//		String responseBody = httpResponse.body().asString();
//		System.out.println("Status Code: " + statuCode + ", Body: " + responseBody);
//	
		
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response httpResponse = httpRequest.request(Method.GET, "/api/profile/user/5e19e187f503b4001767c6d8");
		
		int statusCode = httpResponse.getStatusCode();
		String body  = httpResponse.getBody().asString();
		//System.out.println("Status Code: " + statusCode);
		System.out.println("Body: " + body);
		
		System.out.println();
		
	}

}
