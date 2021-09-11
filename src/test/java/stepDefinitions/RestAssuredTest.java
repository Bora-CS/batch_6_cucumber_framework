package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.protocol.HttpRequestExecutor;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-type", "application/json");
		httpRequest.headers(headers);
		httpRequest.body("{\r\n"
				+ "    \"email\": \"john@test.com\",\r\n"
				+ "    \"password\": \"Test123\"\r\n"
				+ "\r\n"
				+ "}");
		Response response = httpRequest.request(Method.POST, "/api/auth");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		
	}

}
