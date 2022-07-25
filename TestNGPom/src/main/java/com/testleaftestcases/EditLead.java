package com.testleaftestcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{

	@Test
	public void runEditLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName()
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickEdit()
		.updateCompName()
		.clickUpdate()
		.verifyUpdatedCompName();
	}
}