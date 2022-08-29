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

public class TestPage extends BaseClass{
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
				addNewPatientPA.commonpdfunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "uhid"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "patientname"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "age"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dob"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "gender"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "religion"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "nationality"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "guardian"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "guardianrelation"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "maritalstatus"));
						
				addNewPatientPA.ClickNext();
				Thread.sleep(5000);
			
				addNewPatientPA.commonCDFunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "address"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "district"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pincode"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "policestation"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "postoffice"));
				
				addNewPatientPA.ClickcdNext();
				Thread.sleep(5000);
				
				addNewPatientPA.commonHDFunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "weight"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "height"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bp"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pulse"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "spo2"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "provDiagnosis"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "insurance"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "tpa"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "claim"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "policyNumber"));
				
				addNewPatientPA.ClickhdNext();
				Thread.sleep(5000);
				
						addNewPatientPA.enteradAdmissionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiondate"));
						addNewPatientPA.enteradAdmissionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiontime"));
						addNewPatientPA.enteradReferredBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "referredby"));
						addNewPatientPA.selectadUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dr"));
						addNewPatientPA.enteradCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "caseText"));
						addNewPatientPA.enteradFIR(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "fir"));
						addNewPatientPA.selectadRoom(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
						Thread.sleep(5000);
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "Bed"));
			   //Thread.sleep(5000);
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
}
	
	/*

	@Test(priority = 2, description = "Patient name do not accept numbers")
	public void TC2() throws IOException {
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
				addNewPatientPA.commonpdfunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "uhid"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "patientname1"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "age"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dob"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "gender"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "religion"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "nationality"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "guardian"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "guardianrelation"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "maritalstatus"));
						
				addNewPatientPA.ClickNext();
				Thread.sleep(5000);
			
				addNewPatientPA.commonCDFunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "address"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "district"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pincode"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "policestation"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "postoffice"));
				
				addNewPatientPA.ClickcdNext();
				Thread.sleep(5000);
				
				addNewPatientPA.commonHDFunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "weight"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "height"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bp"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pulse"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "spo2"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "provDiagnosis"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "insurance"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "tpa"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "claim"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "policyNumber"));
				
				addNewPatientPA.ClickhdNext();
				Thread.sleep(5000);
				addNewPatientPA.commonADFunction(
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiondate"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiontime"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "referredby"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dr"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "caseText"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "fir"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"),
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed1"));
				
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
}
	
	*/

