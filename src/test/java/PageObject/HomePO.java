package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePO {
	WebDriver driver;
	@FindBy(xpath="//*[text()='Admin']")
	WebElement txtAdmin;
	@FindBy(xpath="//*[text()='User Management']")
	WebElement txtUsermanagement;
	@FindBy(xpath="//*[text()='Users']")
	WebElement txtUser;
	
	@FindBy(id="menu_admin_Job")
	WebElement txtJob;
	@FindBy(id="menu_admin_workShift")
	WebElement txtWorkShift;
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement txtMyInfo;
	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement txtContactDetails;
	
	
	
	public void clickOnUser(WebDriver driver)
	{
	Actions act=new Actions(driver);
	act.moveToElement(txtAdmin).build().perform();
	act.moveToElement(txtUsermanagement).build().perform();
	act.moveToElement(txtUser).click().build().perform();
	
	}
	
	public void clickOnWorkshift(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(txtAdmin).build().perform();
		act.moveToElement(txtJob).build().perform();
		act.moveToElement(txtWorkShift).click().build().perform();
		
	}
	
	public void clickOnMyInfo(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(txtMyInfo).click().build().perform();
		}
	
	
	
}
