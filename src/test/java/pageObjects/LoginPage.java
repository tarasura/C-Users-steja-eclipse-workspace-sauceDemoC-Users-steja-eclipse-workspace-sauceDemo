package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']") WebElement username;
	@FindBy(xpath="//input[@id='user-name']") WebElement password;
	@FindBy(xpath="//input[@id='login-button']") WebElement login;
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
	}

}
