package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	static WebDriver driver;
	
	public WebDriver getBrowserInstance(String browserName) {
		if( browserName.equals("fireFox")) {
			
		}
		return new FirefoxDriver();
		
	}

	@Before()
	
	public static void setup() {
	//driver = new FirefoxDriver();
	}
	
	@After()
	
	public static void tearDown() {
		//driver.quit();
	}

}
