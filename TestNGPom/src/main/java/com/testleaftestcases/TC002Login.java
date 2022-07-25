package com.testleaftestcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC002Login extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin();
		
	}

}