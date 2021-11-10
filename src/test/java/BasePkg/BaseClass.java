package BasePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Screenshot.Screenshots.class)
public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream fp;
	public static Properties prop;
	static {
		prop=new Properties();
        try {
			prop.load(new FileInputStream(new File("D:\\Rupali\\Automation_Selenium\\Task_Workspace\\POM\\src\\test\\java\\properties\\config.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
//	public BaseClass() throws FileNotFoundException, IOException {
//		 prop=new Properties();
//	     prop.load(new FileInputStream(new File("D:\\Rupali\\Automation_Selenium\\Task_Workspace\\POM\\src\\test\\java\\properties\\config.properties")));
//	}	
	@BeforeSuite
	public void openBrowser() throws FileNotFoundException, IOException {
			//BaseClass bs=new BaseClass();
     if(prop.get("Browser").equals("Chrome")) {
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
         }else if(prop.get("Browser").equals("Firefox")) {
        	 WebDriverManager.firefoxdriver().setup();
        	 driver=new FirefoxDriver(); 
          }
     driver.get(prop.getProperty("URL"));
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	
}
