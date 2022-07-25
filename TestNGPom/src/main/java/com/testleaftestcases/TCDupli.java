package com.testleaftestcases;





import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TCDupli extends ProjectSpecificMethods{

	@Test
	public void runDuplicateLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.clickOnEmail()
		.enterEmail()
		.clickFindLeads()
		.clickFirstResultingLead()
		.getLeadName()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyDupLeadName();
	}
}