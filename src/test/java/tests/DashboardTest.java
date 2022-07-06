package tests;

import org.testng.annotations.AfterTest;

import pages.DashboardObj;
import setup.BrowserConfig;

public class DashboardTest extends BrowserConfig {

	@org.testng.annotations.Test
	public static void Test() throws InterruptedException {
		
		new LoginTest().Test();
		DashboardObj DO= new DashboardObj(driver);
		Thread.sleep(3000);
		DO.dropdownclick();
		DO.dropdownselect();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void Testend() {
		driver.close();
	}

}
