package seleniumQTP_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionsWeb.WebButton;
import commonFunctionsWeb.WebElementCommon;
import commonFunctionsWeb.WebTextBox;
import seleniumQTP_Page_Locators.RegisterOne_Page_Locator;

public class RegisterOne_Page_Action {
	public WebDriver driver = null;
	public ExtentTest reporterLogger = null;
	RegisterOne_Page_Locator regOnePL = null;
	
	
	public RegisterOne_Page_Action(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		reporterLogger = logger;
		regOnePL = new RegisterOne_Page_Locator(driver);
		
	}
	
	public void enterUserName(String user) {
		if(regOnePL.getUserName()!=null) {
			if(WebElementCommon.isClickable(regOnePL.getUserName())) {
				WebTextBox.sendInput(regOnePL.getUserName(), user);
				reporterLogger.log(LogStatus.PASS, "User Name entered succesfully.");
			}else {
				reporterLogger.log(LogStatus.FAIL, "User Name not entered.");
			}
		}
		
	}
	
	public void enterPassword(String pass) {
		if(regOnePL.getPassword()!= null) {
			if(WebElementCommon.isClickable(regOnePL.getPassword())) {
				WebTextBox.sendInput(regOnePL.getPassword(), pass);
				reporterLogger.log(LogStatus.PASS, "Password entered succesfully.");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Password not entered.");
			}
		}
	}
	
	public void enterConfirmPassword(String confpass) {
		if(regOnePL.getConfirmPassword()!= null) {
			if(WebElementCommon.isClickable(regOnePL.getConfirmPassword())) {
				WebTextBox.sendInput(regOnePL.getConfirmPassword(), confpass);
				reporterLogger.log(LogStatus.PASS, "Confirm Password entered succesfully.");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Confirm Password not entered.");
			}
		}
	}
	
	public  void clickLoginClick() {
		if(regOnePL.getLoginLink() != null) {
			WebButton.buttonClick(regOnePL.getLoginLink());
			reporterLogger.log(LogStatus.PASS, "Login link clicked succesfully.");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Login link not clicked.");
		}
	}
	
	public void enterDataPageOne(String user, String pass, String confPass) {
		enterUserName(user);
		enterPassword(pass);
		enterConfirmPassword(confPass);
		clickLoginClick();
	}
	
}
