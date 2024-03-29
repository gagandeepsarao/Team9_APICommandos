package com.LMSAPI.Endpoints;

import java.io.IOException;

import com.LMSAPI.Pojo.ProgramPojo;
import com.LMSAPI.StepDef.Hooks;
import com.LMSAPI.Utilities.BaseUtils;
import com.LMSAPI.payload.ProgramPayload;

import static io.restassured.RestAssured.baseURI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProgramRequest extends BaseUtils {
	
	String token = "";
	
	ProgramPojo programpojo;
	LoginRequest loginrequest;
	
	public ProgramRequest() throws IOException {
		this.loginrequest = Hooks.getLoginRequest();
        this.token = loginrequest.getToken();
	}
	
	public Response createNewProgram() throws IOException
	{
		programpojo = ProgramPayload.createPayload();
		System.out.println("token vlaue: "+ token);
		System.out.println(baseURI+endpoints.getString("create"));
	//	 String payload = "{\"programName\": \"TestName\", \"programDescription\": \"TestDescription\", \"programStatus\": \"Active\"}";		 
		 response = RestAssured.given()
			.baseUri(baseURI)
			.header("Authorization", "Bearer " + token)
			.contentType(ContentType.JSON)
			.body(programpojo)
			.post(endpoints.getString("create"));
			
			
			System.out.println(response.asString());
			
			return response;
		}
		
		
		
		
	}


