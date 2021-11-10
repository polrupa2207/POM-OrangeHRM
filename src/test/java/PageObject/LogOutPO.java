package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPO {

	@FindBy(id="welcome")
	WebElement btnLogout;
	@FindBy(linkText="Logout")
	WebElement lnkLogOut;
	
	public void logOutOperation() throws InterruptedException {
		btnLogout.click();
		Thread.sleep(2000);
		lnkLogOut.click();
	}


}

