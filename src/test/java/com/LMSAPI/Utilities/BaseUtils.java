package com.LMSAPI.Utilities;

import java.util.ResourceBundle;
import com.LMSAPI.Pojo.LoginPojo;

import com.LMSAPI.Pojo.ProgramPojo;
import io.restassured.response.Response;

public class BaseUtils {
	
	public static ResourceBundle endpoints = ResourceBundle.getBundle("UserAPICofig");
	
	public static LoginPojo loginPojo = new LoginPojo();
	public static ProgramPojo ProgramPojo = new ProgramPojo();
	
	public static Response response;


}
