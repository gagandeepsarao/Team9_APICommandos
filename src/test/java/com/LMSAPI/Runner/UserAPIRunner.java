package com.LMSAPI.Runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {
				"html:target/cucumberreport.html", 
		        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		},
				monochrome = true,
				features= {"src/test/resources/feature"},
				glue = {"com.LMSAPI.StepDef"})
public class UserAPIRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
}
}
