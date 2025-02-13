package apiLearning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiAssured {
	@Test(enabled=false)
	public void samplegetExample() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification requestSpecification = RestAssured.given();
		Response Request = requestSpecification.request(Method.GET);
		System.out.println(Request.asPrettyString());
		System.out.println(Request.getStatusCode());
	}
	@Test (enabled=false)
	public void Post() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification requestSpecification1 = RestAssured
				.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
		Response request1 = requestSpecification1.request(Method.POST);
		System.out.println(request1.asPrettyString());
		System.out.println(request1.getStatusLine());
	}
	
	@Test (enabled=false)
	public void put() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification requestSpecification2 = RestAssured.given().header("Content-Type", "application/json")
				.body(("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}"));
		Response request2 = requestSpecification2.request(Method.PUT);
		
		System.out.println(request2.asPrettyString());
		System.out.println(request2.getStatusCode());
		
	}
	
	@Test (enabled=false)
	public void Delete() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification requestSpecification3 = RestAssured.given();
		Response request3 = requestSpecification3.request(Method.DELETE);
		System.out.println(request3.asPrettyString());
		System.out.println(request3.getStatusCode());
	}
	
	
	
	
	
	
	
	@Test
	public void aappii() {
		
		RestAssured.baseURI = "https://testapps.strategy.ai";
		RequestSpecification requestSpecification = RestAssured
				.given()
				.header("Content-Type", "application/json");
		Response response = requestSpecification.request(Method.GET,"/strategy-chat/dashboard");
		response.asPrettyString();
		response.getStatusCode();
		response.getStatusLine();
		System.out.println("Response Body:\n" + response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode());
		 System.out.println("Status Line: " + response.getStatusLine());
	}
	
	
}









