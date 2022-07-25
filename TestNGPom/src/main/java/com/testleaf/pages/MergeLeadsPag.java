package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MergeLeadsPag extends ProjectSpecificMethods {

	public static String parentWindow;

	public MergeLeadsPag(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MergeLeadsPag clickFromLead() throws InterruptedException {
		parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='From Lead']/ancestor::tr//img")).click();
		selectLead(1);
		return this;
	}

	private void selectLead(int i) throws InterruptedException {
		// TODO Auto-generated method stub
		switchWindow();
		// click leadId
		Thread.sleep(3000);
		
		WebElement eleLeadId = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[" + i + "]//a"));
		
		if (eleLeadId.isEnabled())
			eleLeadId.click();
		// switch to parentWindow
		driver.switchTo().window(parentWindow);
		
	}

	public MergeLeadsPag clickToLead() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='To Lead']/ancestor::tr//img")).click();
		selectLead(2);
		return this;
	}

	public ViewLeadsPage clickMerge() {
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ViewLeadsPage(driver);
	}
	
	public void switchWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
	
	}

}