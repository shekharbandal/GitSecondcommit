package hrm_StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import hrm_pages.LoginPage;
import hrm_util.TestBase;

public class Hrm_home_stepdefination extends TestBase{

	public LoginPage login;
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   TestBase.initialization();  
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		login = new LoginPage();
           String title =  login.validateLoginPageTitle();
            Assert.assertEquals("OrangeHRM",title);
            
                                                                                             }

	@Then("^user enters username and Password$")
	public void user_enters_username_and_Password()   {
	      login.username().sendKeys("Admin");
	      login.password().sendKeys("admin123");
	      login.login().click();
		
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@Then("^validate home page displays with correct title$")
	public void validate_home_page_displays_with_correct_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	
	
}
