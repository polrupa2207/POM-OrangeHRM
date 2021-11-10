package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.SystemUserPO;
@Listeners(Screenshot.Screenshots.class)
public class SystemUserTestCase extends BaseClass {

@Test(enabled=false)
public void deleteUser() throws InterruptedException {
	SystemUserPO sp=PageFactory.initElements(driver, SystemUserPO.class);
	sp.deleteUser(driver);
}

}
