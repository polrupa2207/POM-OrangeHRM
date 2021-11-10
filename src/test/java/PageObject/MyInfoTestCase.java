package PageObject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePkg.BaseClass;

public class MyInfoTestCase extends BaseClass {

	
	
	@Test
	public void contactDetailsOperation() {
		MyInfoPO mi=PageFactory.initElements(driver, MyInfoPO.class);
		mi.clickOnContactDetails(driver);
	}
}
