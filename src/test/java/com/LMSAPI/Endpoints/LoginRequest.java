package com.LMSAPI.Endpoints;

import java.io.IOException;

import com.LMSAPI.Pojo.LoginPojo;
import com.LMSAPI.payload.LoginPayload;
import com.LMSAPI.Utilities.BaseUtils;


import static io.restassured.RestAssured.baseURI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginRequest extends BaseUtils {
	
	private String token;
	public static LoginPojo logPojo;
	private static LoginRequest loginRequest;
	
	
	int responseCode =0;

	
	public static synchronized LoginRequest getInstance() {
	    if (loginRequest == null) {
	        System.out.println("Creating new instance of LoginRequest");
	        loginRequest = new LoginRequest();
	        System.out.println("Creating new instance of LoginRequest "+loginRequest);
	    } else {
	        System.out.println("Returning existing instance of LoginRequest");
	    }
	    return loginRequest;
	}

	public String getToken() throws IOException
	{
		if(token == null)
		{
			 System.out.print("its here in getToken");
			postRequestToGenerateToken();
		}
		System.out.print("Token is here: "+token);
		return token;
	}
	
	public static void getBaseURL()
	{
		 
		baseURI = endpoints.getString("BASE_URL");
	}
	
	
	public int getResponseCode() {
		return responseCode;
	}
	
	
	public  Response postRequestToGenerateToken() throws IOException
	{
		logPojo = LoginPayload.userLogin();
		
	//	System.out.println(loginPojo.getUserEmail());
	//	System.out.println(loginPojo.getUserEmail());
	//	System.out.println(loginPojo);
	//	System.out.println(baseURI+endpoints.getString("login"));
		String requestBody = "{\"password\": \"lmsHackathon@2024\", \"userLoginEmailId\": \"numpyninja@gmail.com\"}";

		 response = RestAssured.given()
				.baseUri(baseURI)
				.contentType(ContentType.JSON)
				.body(requestBody)
				.post(endpoints.getString("login"));
		 
		   token = response.jsonPath().getString("token"); 
		   responseCode = response.getStatusCode();
		  System.out.println(response.asString());
		return response; 
	}
	

	


}
