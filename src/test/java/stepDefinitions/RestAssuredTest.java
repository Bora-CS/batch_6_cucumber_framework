package stepDefinitions;

import java.util.HashMap;
import java.util.Map;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	
	public static void main(String[] args) {
		
		//Specify 
	 RestAssured.baseURI = "https://boratech.herokuapp.com/";
	 RequestSpecification httpRequest =RestAssured.given();
	 
	 Map<String, String> headers = new HashMap<String, String>();
	 headers.put("Content-Type", "application/json");
	 httpRequest.headers(headers);
	 
	 httpRequest.body("");
	 
	Response httpResponse =httpRequest.request(Method.POST, "/api/user");
	int statusCode = httpResponse.getStatusCode();
	
	String responseBody= httpResponse.body().asString();
	System.out.println("Status Code: " + statusCode + ", Body" + responseBody);
	
	
	
	
	
	
	}

}
