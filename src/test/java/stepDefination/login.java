package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class login {
	
	public WebDriver driver;


	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com/login";
		driver.manage().window().maximize();	
		driver.get(baseURL);
		
	}
	

	@When("User enters {string} email")
	public void User_enters_email(String email) {
		
		//WebElement signupLink = driver.findElement(By.xpath("//*[@id='navbar-inverse-collapse']/div/div/a"));
		//signupLink.click();		
		//WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		//loginLink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement emailField = driver.findElement(By.id("email"));
		//emailField.sendKeys("test@email.com");
		emailField.sendKeys(email);
	}
	
	@And("User enters {string} Password")
	public void User_enters_Password(String Password) {
		WebElement passwordField = driver.findElement(By.id("login-password"));
		passwordField.sendKeys(Password);
	}

	@And("^Clicks Go button$")
	public void clicks_Go_button() throws InterruptedException {
		WebElement goButton = driver.findElement(By.id("login"));
		goButton.click();
		
		Thread.sleep(3000);
	}

	@Then("^He can visit the practice page$")
	public void he_can_visit_the_practice_page() {
		//WebElement practicePage = driver.findElement(By.id("DrpDwnMn06bg"));
		//practicePage.click();
	}

	@Then("^A message is displayed$")
	public void a_message_is_displayed() {
		//driver.quit();
		//System.out.println("Login Successful");
	}

}
