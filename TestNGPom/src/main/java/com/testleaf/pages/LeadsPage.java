package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPag clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPag(driver);
	}
	
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

}