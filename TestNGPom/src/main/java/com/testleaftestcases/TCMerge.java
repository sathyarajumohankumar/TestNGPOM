package com.testleaftestcases;


import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TCMerge extends ProjectSpecificMethods {

	@Test
	public void runMergeLeads() throws InterruptedException {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.clickToLead()
		.clickMerge()
		.getLeadName();
		
	}
}