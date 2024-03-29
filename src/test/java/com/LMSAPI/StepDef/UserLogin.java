package com.LMSAPI.StepDef;



import java.io.IOException;

import org.testng.Assert;

import com.LMSAPI.Endpoints.LoginRequest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
public class UserLogin {
	
	LoginRequest loginRequest;
	Response response ;
	
	
	
	
	@Given("Admin creates request with valid credentials")
	public void admin_creates_request_with_valid_credentials() {
	   System.out.println("admin send request");
	}

	@When("Admin calls Post Https method  with valid endpoint")
	public void admin_calls_Post_Https_method_with_valid_endpoint() throws IOException {
		loginRequest = LoginRequest.getInstance();
	   response = loginRequest.postRequestToGenerateToken();
	}

	@Then("Admin receives {int} created with auto generated token")
	public void admin_receives_created_with_auto_generated_token(Integer int1) {
	int	responseCode =  response.getStatusCode();
	System.out.println(responseCode);
		Assert.assertEquals(responseCode,200 );
	}


}
