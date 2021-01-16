package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leave_Page {

	 WebDriver driver;
	 
	 By Leave_link = By.cssSelector("#menu_leave_viewLeaveModule");
	 By from_date = By.id("calFromDate");
	 By to_date = By.xpath("//input[@id = 'calToDate']");
	 By leave_status_rejected_checkbox = By.xpath("//div[@id = 'leaveList_chkSearchFilter_checkboxgroup']//input[2]");
	 By Employee_textbox = By.xpath("input[name = 'leaveList[txtEmployee][empName]']");
	
	 public Leave_Page(WebDriver driver) {
		 
		 
	}
	 
}
