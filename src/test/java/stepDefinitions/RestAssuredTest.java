package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	public static void main(String[] args) {
		//specifying the Base URI of the web service
		RestAssured.baseURI="https://boratech.herokuapp.com";
		//creating client with Rest Assured
		RequestSpecification httpRequest = RestAssured.given();
//		RequestSpecification httpRequest =(RequestSpecification) RestAssured.get();
		
//		Map<String,String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "application/json");
		
		//Login
//		httpRequest.headers(headers);
//		String requestBody= "{\"email\":\"SOPHIAShe4@gmail.com\",\"password\": \"SOPHIA123\"\n"+"}");
//		httpRequest.body(requestBody);
//	
		//register
//		httpRequest.headers(headers);
//		httpRequest.body("{\n" + 
//				"	\"name\": \"SOPHIA\",\n" + 
//				"	\"email\": \"SOPHIAShe4@gmail.com\",\n" + 
//				"	\"password\": \"SOPHIA123\"\n" + 
//				"}");

	Response httpResponse	= httpRequest.request(Method.GET, "/api/profile");
	int statusCode= httpResponse.getStatusCode();
	String responseBody =httpResponse.body().asString();
	System.out.println("Status Code:"+statusCode+", Body"+responseBody);
	}
}
