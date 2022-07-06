package tests;


import org.testng.annotations.AfterTest;
import pages.DashboardObj;
import pages.LoginObj;
import setup.BrowserConfig;


public class LoginTest extends BrowserConfig {
	
	
	@org.testng.annotations.Test
	public void Test() throws InterruptedException {
	    new BrowserConfig().test();
		
		LoginObj LO= new LoginObj(driver);
		DashboardObj DO= new DashboardObj(driver);
		
        LO.emailfill("bhaiyalalprajapati.ss@smartdatainc.io");
        LO.passfill("123456");
        LO.loginclick();
        
        Thread.sleep(5000);
        
        if(DO.headervisible()) {
               	 System.out.println("Dashboard is visible");
        }
        else {
        	 System.out.println("Dashboard is not visible");
        }
		
	}
	
@AfterTest
	public void Testend() {
		driver.close();
	}
}