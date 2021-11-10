package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactDetailsPO {
	@FindBy(id="btnSave")
	WebElement btnEdit;
	
	@FindBy(id="contact_street1")
	WebElement txtAddress_street1;
	
	@FindBy(id="contact_street2")
	WebElement txtAddress_street2;
	
	@FindBy(id="contact_city")
	WebElement txtcontact_city;
	
	@FindBy(id="contact_province")
	WebElement txtcontact_province;
	
	@FindBy(id="contact_emp_zipcode")
	WebElement txtcontact_emp_zipcode;
	
	@FindBy(id="contact_country")
	WebElement drpdwncontact_country;
	
	@FindBy(id="contact_emp_hm_telephone")
	WebElement txtcontact_emp_hm_telephone;
	
	@FindBy(id="contact_emp_mobile")
	WebElement txtcontact_emp_mobile;
	
	@FindBy(id="contact_emp_work_telephone")
	WebElement txtcontact_emp_work_telephone;
	
	@FindBy(id="contact_emp_work_email")
	WebElement txtcontact_emp_work_email;
	
	@FindBy(id="contact_emp_oth_email")
	WebElement txtcontact_emp_oth_email;
	
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	@FindBy(id="btnAddAttachment")
	WebElement btnAddAttachment;
	
	@FindBy(id="ufile")
	WebElement robot_ufile;
	
	@FindBy(id="btnSaveAttachment")
	WebElement btnSaveAttachment;
	
	
	public void addDetails(String firstAddress,String secondAddress,String city,String state,
			String zipCode,String country,String hm_telephone,String mobile,String work_telphn,String work_email,
			String oth_email) {
		btnEdit.click();
		txtAddress_street1.clear();
		txtAddress_street1.sendKeys(firstAddress);
		
		txtAddress_street2.clear();
		txtAddress_street2.sendKeys(secondAddress);
		
		txtcontact_city.clear();
		txtcontact_city.sendKeys(city);
		
		txtcontact_province.clear();
		txtcontact_province.sendKeys(state);
		
		txtcontact_emp_zipcode.clear();
		txtcontact_emp_zipcode.sendKeys(zipCode);
		
		Select s=new Select(drpdwncontact_country);
		s.selectByVisibleText(country);
		
		txtcontact_emp_hm_telephone.clear();
		txtcontact_emp_hm_telephone.sendKeys(hm_telephone);
		
		txtcontact_emp_mobile.clear();
		txtcontact_emp_mobile.sendKeys(mobile);
		
		txtcontact_emp_work_telephone.clear();
		txtcontact_emp_work_telephone.sendKeys(work_telphn);
		
		txtcontact_emp_work_email.clear();
		txtcontact_emp_work_email.sendKeys(work_email);
		
		txtcontact_emp_oth_email.clear();
		txtcontact_emp_oth_email.sendKeys(oth_email);
		
		btnSave.click();
		
		//btnAddAttachment.click();
		
		
		
	}
	
}
