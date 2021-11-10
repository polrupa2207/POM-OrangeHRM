package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyInfoPO {
@FindBy(xpath="//a[text()='Contact Details']")
WebElement txtContactDetails;



public void clickOnContactDetails(WebDriver driver) {
	Actions a=new Actions(driver);
	a.moveToElement(txtContactDetails).click().build().perform();
}


}
