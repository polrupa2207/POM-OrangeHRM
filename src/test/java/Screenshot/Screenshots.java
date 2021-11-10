package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BasePkg.BaseClass;

public class Screenshots extends BaseClass implements ITestListener{
		public static void takScreenshot() {
			SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
			String s=d.format(new Date());
			TakesScreenshot ts=(TakesScreenshot)driver;
			File f=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(f, new File("D:\\Rupali\\Automation_Selenium\\Task_Workspace\\POM\\src\\test\\resources\\Screenshot\\"+s+".jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void onTestStart(ITestResult result) {
			takScreenshot();
			System.out.println(result.getName());
		}

		public void onTestSuccess(ITestResult result) {
			takScreenshot();
			//System.out.println(result.getName());
		}

		public void onTestFailure(ITestResult result) {
			System.out.println(result.getName());
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			System.out.println("Test case execution has been started");
		}

		public void onFinish(ITestContext context) {
			System.out.println("Test case execution has been started");
			
		}
}
