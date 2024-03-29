package com.LMSAPI.payload;


import com.LMSAPI.Pojo.LoginPojo;
import com.LMSAPI.Utilities.BaseUtils;

public class LoginPayload extends BaseUtils {
	
	public static LoginPojo userLogin() {
		
		
		loginPojo.setPassword(endpoints.getString("Password"));
		loginPojo.setUserEmail(endpoints.getString("Username"));
		System.out.println("ProgramPayload is :"+loginPojo);
		return loginPojo;
		
	}
	
	

}
