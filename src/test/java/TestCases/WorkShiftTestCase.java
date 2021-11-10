package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.WorkShiftPO;

public class WorkShiftTestCase extends BaseClass{
	
	
	@Test
	public void addWorkshiftOperation() throws InterruptedException {
		WorkShiftPO ws=PageFactory.initElements(driver, WorkShiftPO.class);
		Thread.sleep(2000);
		ws.addWorkShift1();
		//ws.addWorkShift2();
	}
	
	
}
