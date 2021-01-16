package hrm_pages;

import hrm_util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm_util.TestBase;

public class HomePage extends TestBase {

	
	By Admin_link = By.id("menu_admin_viewAdminModule");
	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement Leave_link;
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement recruitment_link;
	
	By Directory = By.id("menu_directory_viewDirectory");
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
                                }
	
	public String verify_homepage_title() {
		 return (driver.getTitle());
	}
	/*public recruitment_page clickOnRecruitmentLink() {
		 recruitment_link.click();
		 return new recruitment_page();
		
	}*/
	
}
