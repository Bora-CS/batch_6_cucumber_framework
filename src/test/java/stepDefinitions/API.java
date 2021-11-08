package stepDefinitions;




import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;;





public class API {

	@Test
	void TestTest() {
HashMap<String, String> headers= new HashMap<>();
		
		headers.put("properties", "states");
		headers.put("report_Type", "All");
RestAssured.baseURI= "http://ip.jsontest.com/";
Response response = (Response) given()

.when().post().then().assertThat().statusCode(200);
		System.out.println(response.asString());
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
//	public void getAllFilms() {
//		RestAssured.baseURI="";
//		String body= ""
//	}
	
}
