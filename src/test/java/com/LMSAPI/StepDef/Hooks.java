package com.LMSAPI.StepDef;


import java.io.IOException;

import com.LMSAPI.Endpoints.LoginRequest;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	

	private static LoginRequest loginRequest;
	@Before
    public void setUp(Scenario scenario) throws IOException {
		
        if (loginRequest == null) {
        	
        	loginRequest = LoginRequest.getInstance();
        	
        	loginRequest.getBaseURL(); 
        }
        
    }

    public static LoginRequest getLoginRequest() {
        return loginRequest;
    }

}
