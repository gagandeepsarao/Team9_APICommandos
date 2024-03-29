package com.LMSAPI.payload;

import com.LMSAPI.Pojo.ProgramPojo;
import com.LMSAPI.Utilities.BaseUtils;


public class ProgramPayload extends BaseUtils {
	
	
	
	
	public static ProgramPojo createPayload() {
		ProgramPojo.setProgramDescription("Sample desc");
		ProgramPojo.setProgramName("Sample name");
		ProgramPojo.setProgramStatus("Active");
		return ProgramPojo;
		
		
	}

}
