package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObj {

	WebDriver driver= null;
	
	By logo= By.xpath("//app-root[1]/app-login[1]/div[1]/div[1]/div[1]/img[1]");
	
	By email= By.xpath("//div[1]/div[1]/input[1]");
	
	By pass= By.xpath("//div[2]/div[1]/input[1]");
	
	By loginBtn= By.xpath("//button[contains(text(),'Log In')]");

	By forgotpass= By.xpath("//div[2]/div[1]/div[4]/div[1]/a[1]");


	public LoginObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public void Logovisible() {
		driver.findElement(logo).isDisplayed();
	}
	
	public void emailfill(String eid) {
		driver.findElement(email).sendKeys(eid);
	}
	
	public void passfill(String pswd) {
		driver.findElement(pass).sendKeys(pswd);
	}
	
	public void loginclick() {
		driver.findElement(loginBtn).click();
	}
	
	public void forgotpassclick() {
		driver.findElement(forgotpass).click();
	}
	
}
