package com.testleaf.pages;

	package com.testleaf.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import com.testleaf.base.ProjectSpecificMethods;

	public class DuplicLeadPage extends ProjectSpecificMethods {

		public DuplicLeadPage(RemoteWebDriver driver) {
			this.driver = driver;
		}
		
		public ViewLeadPage clickCreateLead() throws InterruptedException {
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			Thread.sleep(3000);
			return new ViewLeadPage(driver);
		}
	}
}
