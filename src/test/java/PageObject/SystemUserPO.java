package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SystemUserPO {
	@FindBy(id ="btnDelete")
	WebElement btnDelete;
	@FindBy(id ="dialogDeleteBtn")
	WebElement dialogDeleteBtn;
	 
	
	public static WebElement user2;
	public static void findUser(WebDriver driver) {
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
		List<WebElement> totalColumns = driver.findElements(By.xpath("//table[@id='resultTable']//tr[1]//td"));

		System.out.println(totalRows.size());
		System.out.println(totalColumns.size());
		for (int i = 1; i <= totalRows.size()-1; i++) {
			for (int j = 1; j <= totalColumns.size()-1; j++) {
				WebElement userName = driver
						.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[" + j + "]"));
				if (userName.getText().contains("Depraiser")) {
					user2 = driver.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[1]"));

				}
			}
		}
	}
	
	public void deleteUser(WebDriver driver) throws InterruptedException {
		findUser(driver);
		user2.click();
		btnDelete.click();
		Thread.sleep(2000);
		dialogDeleteBtn.click();
	}

}
