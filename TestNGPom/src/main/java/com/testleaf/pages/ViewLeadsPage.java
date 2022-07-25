package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods {

	public static String leadName;
	public static String dupLeadName;

	public ViewLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewLeadsPage confirmFirstName(String fName) {
		Assert.assertEquals(fName,driver.findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	public LeadsPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}

	public ViewLeadsPage getLeadName() {
		leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(leadName);
		return this;
	}

	public DuplicLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicLeadPage(driver);
	}

	public ViewLeadsPage verifyDupLeadName() throws InterruptedException {
		
		Thread.sleep(3000);
		dupLeadName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(leadName, dupLeadName);
		return this;
	}
	
	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public void verifyUpdatedCompName() {
		boolean contains = driver.findElement(By.id("viewLead_companyName_sp")).getText().contains("Thunderbird");
		Assert.assertTrue(contains);
	}
}