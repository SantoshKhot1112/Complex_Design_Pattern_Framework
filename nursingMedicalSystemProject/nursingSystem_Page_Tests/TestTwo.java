package nursingSystem_Page_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializerFunctions.BaseClass;
import initializerFunctions.CommonStaticDM;
import nursingSystem_Page_Actions.AddNewPatient_Page_Action;
import nursingSystem_Page_Actions.Dashboard_Page_Action;
import nursingSystem_Page_Actions.Login_Page_Action;

public class TestTwo extends BaseClass {
	Login_Page_Action regOnePA = null;
	Dashboard_Page_Action dashboardPA = null;
	AddNewPatient_Page_Action addNewPatientPA = null;
	
	
	
	@Test(priority = 1, description = "Patient name accepts alphabates")
	public void TC1() throws IOException {
		try {
			regOnePA = new Login_Page_Action(driver, reporterLogger);
			regOnePA.successfulLogin(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "username"),
					PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "password"));
		
			dashboardPA = new Dashboard_Page_Action(driver, reporterLogger);
			dashboardPA.clickPatientMgtLink();
			dashboardPA.ClickInPatientRegLink();
	
			addNewPatientPA = new AddNewPatient_Page_Action(driver, reporterLogger);		
				Dashboard_Page_Action dashboardPA = new Dashboard_Page_Action(driver, reporterLogger);
				dashboardPA.clickPatientMgtLink();
				dashboardPA.ClickInPatientRegLink();
												
				AddNewPatient_Page_Action addNewPatientPA = new AddNewPatient_Page_Action(driver, reporterLogger);
				
						
				addNewPatientPA.ClickNext();
				Thread.sleep(5000);
			
				
				
				addNewPatientPA.ClickcdNext();
				Thread.sleep(5000);
				
				
				
				addNewPatientPA.ClickhdNext();
				Thread.sleep(5000);
				
								
						
				addNewPatientPA.selectadRoom(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
				Thread.sleep(5000);
				addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "Bed"));
				
						addNewPatientPA.clickAddPatientBtn();
				
			
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
}
