package stepDefinition;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class LoginSteps {
	public WebDriver driver;
	LoginPage lp;
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	  
	}
	
	@When("User enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String username, String password) {
		
		lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		
		
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
//		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    lp.clickLogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    String title=driver.getTitle();
	    Assert.assertEquals(title,"Swag Labs");
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}




}
