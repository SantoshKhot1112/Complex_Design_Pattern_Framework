package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionsWeb.WebLink;
import nursingSystem_Page_Locators.Dashboard_Page_Locator;

public class Dashboard_Page_Action {
	public WebDriver driver = null;
	public ExtentTest reporterLogger = null;
	Dashboard_Page_Locator dashboardPL = null;
	
	public Dashboard_Page_Action(WebDriver driver, ExtentTest reporterLogger) {
		this.driver = driver;
		this.reporterLogger = reporterLogger;
		dashboardPL = new Dashboard_Page_Locator(driver);
	}
	
		
	public void clickPatientMgtLink() {
		if(dashboardPL.getPatientMgtLink()!=null) {
			WebLink.linkClick(driver, "Patient Management");
			reporterLogger.log(LogStatus.PASS, "Patient Management Link Clicked Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Patient Management Link not Clicked");
		}
	}
	
	public void ClickInPatientRegLink() {
		if(dashboardPL.getInPatientRegLink()!=null) {
			WebLink.linkClick(driver, "In-Patient Registration");
			reporterLogger.log(LogStatus.PASS, "In-Patient Registration Link Clicked Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "In-Patient Registration Link not Clicked");
		}
	}

	
}
