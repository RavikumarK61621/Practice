package apiLearning;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class APIBDDlearning { 
	
	@Test
	public void apiBDD() {
		
		when()
			.get("https://reqres.in//api/users?page=2")
		
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
	}
	
	Response response = given()
		    .header("Content-Type", "application/json")
		    .when()
		    .get("https://api.example.com/users/1")
		    .then()
		    .statusCode(200)
		    .extract().response();

}
