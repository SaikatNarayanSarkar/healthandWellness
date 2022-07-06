package setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	
	protected static WebDriver driver= null;

	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saika\\eclipse-workspace\\beas.healthandwelness\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		    driver.get("http://www.beas.in/healthadmin");          
	}

}
