package com.LMSAPI.StepDef;


import java.io.IOException;

import org.testng.Assert;

import com.LMSAPI.Endpoints.LoginRequest;
import com.LMSAPI.Endpoints.ProgramRequest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ProgramController {
	
	ProgramRequest programRequest ;
	Response response;
	
	public ProgramController() throws IOException {
		programRequest =  new ProgramRequest();
	
	}
	
	
	@Given("Admin creates POST Request for the LMS with request body")
	public void admin_creates_post_request_for_the_lms_with_request_body() {
	    System.out.println("Creating program");
	}

	@When("Admin sends HTTPS Request and  request Body with endpoint")
	public void admin_sends_https_request_and_request_body_with_endpoint() throws IOException {
	   response = programRequest.createNewProgram();
	}

	@Then("Admin receives {int} Created Status with response body.")
	public void admin_receives_created_status_with_response_body(Integer int1) {
	    System.out.println("Program Created");
	}


}
