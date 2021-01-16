package hrm_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm_util.TestBase;

public class LoginPage extends TestBase {

	 WebDriver  driver;
	@FindBy(xpath = "//input[@name = 'txtUsername']")
	WebElement username;
	
	@FindBy(css= "input[id = 'txtPassword']")
	WebElement password;
	
	@FindBy(name = "Submit")
	WebElement loginbtn;
	//WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	public HomePage login(String un,String pwd) {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", loginbtn);
		return new HomePage();
	}
	
	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
		
		                                       }
	public WebElement login() {
		return loginbtn;
	}
}
