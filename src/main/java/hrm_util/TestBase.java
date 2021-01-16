package hrm_util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\NewWorkspace\\PO_OrangeHRM_BDD_cucumber\\src\\main\\"
					+ "java\\hrm_config\\config.properties");
			prop.load(fis);
		}catch (IOException e) {
			e.getMessage();
		}
		   }

	public static void initialization() {
	   
		  String browsername = prop.getProperty("browser");
		  
		  if(browsername.equals("chrome")) {
			  System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver(); 
		  }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //driver.manage().timeouts().implicitlyWait(, unit)
		  driver.get(prop.getProperty("url"));
		  
	}
	
}
