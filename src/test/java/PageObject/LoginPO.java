package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO {
	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btnLogin;
	
	
	public void loginOperation() {
		txtUsername.clear();
		txtUsername.sendKeys("Admin");
		
		txtPassword.clear();
		txtPassword.sendKeys("admin123");
		
		btnLogin.click();
	}
}
