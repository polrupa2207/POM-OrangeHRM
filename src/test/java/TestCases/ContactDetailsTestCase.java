package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.ContactDetailsPO;

public class ContactDetailsTestCase extends BaseClass {
	@Test(dataProvider="TestData")
	public void addContactDetails(String firstAddress, String secondAddress, String city, String state, String zipCode,
			String country, String hm_telephone, String mobile, String work_telphn, String work_email,String oth_email) 
	{
		ContactDetailsPO cd = PageFactory.initElements(driver, ContactDetailsPO.class);
		cd.addDetails(firstAddress, secondAddress, city, state, zipCode, country, hm_telephone, mobile, work_telphn,
				work_email, oth_email);
	}

	@DataProvider(name="TestData")
	public Object data() {
		
		Object[][] obj=new Object[1][11];
		obj[0][0]="pune";
		obj[0][1]="apune";
		obj[0][2]="punep";
		obj[0][3]="maharashtra";
		obj[0][4]="412334";
		obj[0][5]="India";
		obj[0][6]="02112233456";
		obj[0][7]="9090909090";
		obj[0][8]="09909099898";
		obj[0][9]="punework@gmail.com";
		obj[0][10]="puneoth@gmail.com";
		
		
		
		
		
		return obj;

	}

}
