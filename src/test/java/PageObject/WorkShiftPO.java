package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WorkShiftPO {
	//WebDriver driver;
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement btnAdd;
	@FindBy(xpath="//input[@id='workShift_name']")
	WebElement txtworkShiftname;
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	
	public void addWorkShift1() {
		btnAdd.click();
		txtworkShiftname.clear();
		txtworkShiftname.sendKeys("Day_shift");
		btnSave.click();
	}	
	public void addWorkShift2() {
		btnAdd.click();
		txtworkShiftname.clear();
		txtworkShiftname.sendKeys("Night_shift");
		btnSave.click();
		
	}

}
