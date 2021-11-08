import java.util.HashMap;
import java.util.Map;


public class RestAssured {
	//Specify the base URL to the Restful web service
			RestAssured.baseURI = "https://boratech.herokuapp.com";

			// Get the RequestSpecification of the request that you want to sent
			// to the server. The server is specified by the BaseURI that we have
			// specified in the above step.
			RequestSpecification httpRequest = RestAssured.given();

			// Creating Headers map:
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("Content-type", "application/json");


			//Spesifying the Headers
			httpRequest.headers(headers);

			//Creating the request body in String format
			String requestBody = "{\r\n"
					+ "    \"email\": \"john@test.com\",\r\n"
					+ "    \"password\": \"Test123\"\r\n"
					+ "\r\n"
					+ "}";

			//Attaching the request body into the request
			httpRequest.body(requestBody);

			//Make request to server by specifying the method type and endpoint
			Response response = httpRequest.request(Method.POST, "/api/auth");
			
			//Getting the response body from the respose object
			String responseBody = response.getBody().asString();

			//Printing the response Body
			System.out.println(responseBody);



	Verifying the Response of the Requst: 

	There are three items we have to Validate:
			=> Status Code
			=> Respone Body Contains the data we want
			=> Headers


	How to get Response Status Code:
			=> response.getStatusCode();

	How to get Headers: 
			=> response.getHeaders();
			
}
