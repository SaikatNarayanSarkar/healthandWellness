package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardObj {

	WebDriver driver=null;
	
	By dashboardHeader= By.xpath("//h4[contains(text(),'Welcome !')]");
	By dropdown=By.xpath("//div[1]/select[1]");
	By dropdownsel= By.xpath("//div[1]/select[1]/option[2]");
	
	public DashboardObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public boolean headervisible() {
		driver.findElement(dashboardHeader);
		return true;
		}
	
	public void dropdownclick() {
		driver.findElement(dropdown).click();
	}
	
	public void  dropdownselect() {
		driver.findElement(dropdownsel).click();
	}
	
}
