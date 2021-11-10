package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.HomePO;
import Screenshot.Screenshots;
@Listeners(Screenshot.Screenshots.class)
public class HomeTestCase extends BaseClass {
	@Test
	public void homePageAdminOperation() {
		HomePO hp=PageFactory.initElements(driver, HomePO.class);
		//hp.clickOnUser(driver);
		hp.clickOnWorkshift(driver);
		
	}
	@Test
	public void homePageMyInfoOperation() {
		HomePO hp=PageFactory.initElements(driver, HomePO.class);
		hp.clickOnMyInfo(driver);
		}
	
	
}
