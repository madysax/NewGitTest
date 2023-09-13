package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class PracticePage {
	static WebDriver driver;
	
	@Given("User is on the Practice Page")
	public void user_is_on_Home_Page() {
		driver = new FirefoxDriver();
		String baseURL = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();	
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}

	@And("Click on BMW radio button")
	public void Click_on_BMW_radio_button() {
		driver.findElement(By.id("bmwradio")).click();
		driver.quit();
	}
}
