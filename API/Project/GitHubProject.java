package activities;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterClass;

public class  GitHubProject{

	
	RequestSpecification requestSpec;
	
	ResponseSpecification responseSpec;

	String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDKS/p4ANJAID56krvo+afXhzyY3YD6CK41eIu3FMW59FInbdIEO1VDMwUIAlun4YUnsgETZGvhbPrVL/sBLpaMdqdNTt/WdjEFoVSAORRb7tpqckkMkxorH3JVtaddfeg2GAkiO2JAj2tKwejMJQTXh0GBbBPb/nXOyzKF/X4ppvk1bXid9N5vP8/5dF8iJslLrdQvpWIbhdqaH+QfgNpp1LoQfADpWvihP9iZxXv9wQg7I5FW1i7rZlFJTA2dbjTyOAonj6lhLzsZdueOEZSLcr144m4HKsmVi8SkE8v7zgYGmJEFr1A+zPJuvr+K3qjdS1ln76fjQ43yERxFk9TLS4JdY6yEj22h31GL6tqcVzNRC5aGnNqu/pgrhhbKAKSYaUyfYCytbH1zItYeEUPj/csnH7MnWCW7gSo9OrzEWH+S0nV1Nhi4czkweIw+uhFJnG+Ko5ql2p5hfemyc4DJyPDhSNAiYF09Jrn5z86TQ/0TVjawyNGzWFchLE/EXX8=";
	int keyId = 0;	

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://api.github.com";

		requestSpec = new RequestSpecBuilder()
				// Set content type
				.setContentType(ContentType.JSON)
				// Set access token
				.addHeader("Authorization", "token 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")
				// Set base URL
				.setBaseUri("https://api.github.com")
				// Build request specification
				.build();

	}

	@Test(priority=1)
	public void postRequest() {

		String reqBody = "{\"title\": \"RawMango\", \"key\": \""+sshKey+"\"}";

		Response response = given().spec(requestSpec) // Use requestSpec
				.body(reqBody) // Send request body
				.when().post("/user/keys"); // Send POST request

		// Response body
		String resBody = response.getBody().asPrettyString();		
		System.out.println("Response Body: ");
		System.out.print(resBody);

		// Check status code.
		response.then().statusCode(201);

	}

	@Test(priority=2)
	public void getRequest() {

		// Send get request.
		Response response = given().spec(requestSpec)
				.when().get("/user/keys"); 

		// Print response body
		String resBody = response.getBody().asPrettyString();
		System.out.println("Response Body : ");
		System.out.print(resBody);		

		// Check status code.
		response.then().statusCode(200);
	}

	@Test(priority=3)
	public void deleteRequest() {

		// Send delete request.
		Response response = given().spec(requestSpec)
				.pathParam("keyId", sshKey).when().delete("/user/keys/{keyId}");

		// Print response body
		String resBody = response.getBody().asPrettyString();
		System.out.println("Response Body : ");
		System.out.print(resBody);	

		// Check status code.
		response.then().statusCode(404);


	}


}