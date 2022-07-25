package com.testleaftestcases;



import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TCDelLead extends ProjectSpecificMethods{
	
	@Test
	public void runDeleteLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.clickOnPhone()
		.enterPhoneNumber()
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickDelete()
		.clickFindLeads()
		.enterLeadID()
		.clickFindLeads()
		.verifyLeadDisplayed();
	}

}