package stepDefinations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;

public class Stepdefinations {

	public static WebDriver driver;
	

	 String URL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	//String URL ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	 
	 /*@Given("^user navigates to browser$")
	 public void user_navigates_to_browser() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }*/
	 
	@Given("^user navigates to browser$")
	public void user_navigates_to_browser()   {
	  System.out.println("Browser opened");
	     driver = new ChromeDriver();
	     System.setProperty("WebDriver.chrome.driver","C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get(URL);
	}

	@Given("^user enters username and password$")
	public void user_enters_username_and_password()  {
		 WebElement username = driver.findElement(By.id("txtUsername"));
		  WebElement password = driver.findElement(By.id("txtPassword"));
	  username.sendKeys("Admin");
	  password.sendKeys("admin123");
	     WebElement Login_btn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
	     Login_btn.click();
	}

	
	
	public void user_opens_browser() throws Throwable {
	   
	}

	@Given("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		  WebElement username = driver.findElement(By.id("txtUsername"));
		  WebElement password = driver.findElement(By.id("txtPassword"));
	  username.sendKeys("Admin");
	  password.sendKeys("admin123");
	                    
	}
	
	
	@Given("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		  WebElement login_btn = driver.findElement(By.id("btnLogin"));
		login_btn.click();
	     
	}

	@Given("^validate home page displays with correct title$")
	public void validate_home_page_displays_with_correct_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("^user clicks on Performance link$")
	public void user_clicks_on_Performance_link() throws Throwable {
	     WebElement performance_link = driver.findElement(By.id("menu__Performance"));
	     performance_link.click();
		
	}
	@Given("^user clicks on Directory link using shift key$")
	public void user_clicks_on_Directory_link_using_shift_key() throws Throwable {
	    WebElement Directory = driver.findElement(By.id("menu_directory_viewDirectory"));
	     Actions act = new Actions(driver);
	     act.keyDown(Keys.SHIFT).click(Directory).keyUp(Keys.SHIFT).build().perform();
	     Set<String> windows = driver.getWindowHandles();
	     Iterator<String> it = windows.iterator();
	    String first_window =  it.next();
	     String second_window = it.next();
	     driver.switchTo().window(second_window);
	     System.out.println("Focussed window title is " + driver.getTitle());
	}


@Given("^user clicks on Marketplace link$")
public void user_clicks_on_Marketplace_link() throws Throwable {
     WebElement Marketplace_link = driver.findElement(By.xpath("//input[@id = 'MP_link']"));
     Marketplace_link.click();
     }

@Given("^click on Install button of Integration with Toggle$")
public void click_on_Install_button_of_Integration_with_Toggle() throws Throwable {
    WebElement Install_button = driver.findElement(By.xpath("//input[@id = 'installButton2']"));
    Install_button.click();
	  
          }
@Given("^click on Ok button of alert box$")
public void click_on_Ok_button_of_alert_box() throws Throwable {
    
	Set<String> popups = driver.getWindowHandles();
	Iterator<String> it = popups.iterator();
	String popup1 = it.next();
	driver.switchTo().window(popup1);
	System.out.println("page tittle"+  driver.getTitle());
	/*Alert alert = driver.switchTo().alert();
	String alert_message = driver.switchTo().alert().getText();
	System.out.println("The Alert message is " + alert_message);
	WebElement alert1 = driver.findElement(By.id("installConfModal"));
	driver.switchTo().alert().accept();*/
	Thread.sleep(4000);
	//WebElement conform = driver.findElement(By.xpath("//div[@class='modal hide in']/div[3]//input[@value='Confirm']"));
	/*WebDriverWait wait = new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.visibilityOf(conform));
	conform.click();*/
	Alert alert = driver.switchTo().alert();
	String alertmessage = driver.switchTo().alert().getText();
	
}

	
}
