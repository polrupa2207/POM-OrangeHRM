package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.LogOutPO;
import PageObject.LoginPO;

public class LogOutTestCase extends BaseClass{
	@Test
	public void logoutOeration() throws InterruptedException {
		LogOutPO lo=PageFactory.initElements(driver, LogOutPO.class);
		lo.logOutOperation();
	}
}
