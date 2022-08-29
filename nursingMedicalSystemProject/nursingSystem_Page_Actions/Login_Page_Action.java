package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionsWeb.WebButton;
import commonFunctionsWeb.WebElementCommon;
import commonFunctionsWeb.WebTextBox;
import nursingSystem_Page_Locators.Login_Page_Locator;

public class Login_Page_Action {
	public WebDriver driver = null;
	public ExtentTest reporterLogger = null;
	Login_Page_Locator loginPL = null;
	
	public Login_Page_Action(WebDriver driver, ExtentTest reporterLogger) {
		this.driver = driver;
		this.reporterLogger = reporterLogger;
		loginPL = new Login_Page_Locator(driver);
	}
	
	public void enterUserName(String user) {
		if(loginPL.getUserName()!=null) {
			if(WebElementCommon.isClickable(loginPL.getUserName())) {
				WebTextBox.sendInput(loginPL.getUserName(), user);
				reporterLogger.log(LogStatus.PASS, "User Name Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "User Name not Entered");
			}
		}
	}
	
	public void enterPassword(String password) {
		if(loginPL.getPassword()!=null) {
			if(WebElementCommon.isClickable(loginPL.getPassword())) {
				WebTextBox.sendInput(loginPL.getPassword(), password);
				reporterLogger.log(LogStatus.PASS, "Password Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Password not Entered");
			}
		}
	}
	
	public void clickLoginBtn() {
		if(loginPL.getLoginBtn()!=null) {
			WebButton.buttonClick(loginPL.getLoginBtn());
			reporterLogger.log(LogStatus.PASS, "Login Button Clicked Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Login Button not Clicked");
		}
	}
	
	public void successfulLogin(String user, String password) {
		enterUserName(user);
		enterPassword(password);
		clickLoginBtn();
	}
}
