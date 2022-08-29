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

public class Login_Page_Test extends BaseClass{
	Login_Page_Action regOnePA = null;
	Dashboard_Page_Action dashboardPA = null;
	AddNewPatient_Page_Action addNewPatientPA = null;
	
	
	
	@Test(priority = 1, description = "Patient name accepts alphabates")
	public void TC13() throws IOException {
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
				addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed1"));
				//Thread.sleep(5000);
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	

	@Test(priority = 2, description = "Patient name do not accept numbers")
	public void TC14() throws IOException {
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
						addNewPatientPA.enteradAdmissionDate(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiondate"));
						addNewPatientPA.enteradAdmissionTime(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "admissiontime"));
						addNewPatientPA.enteradReferredBy(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "referredby"));
						addNewPatientPA.selectadUnderDoctor(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dr"));
						addNewPatientPA.enteradCase(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "caseText"));
						addNewPatientPA.enteradFIR(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "fir"));
						addNewPatientPA.selectadRoom(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "room"));
						Thread.sleep(5000);
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed2"));
						//Thread.sleep(5000);
						
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	@Test(priority = 3, description = "Patient name do not accept Special Characters")
	public void TC15() throws IOException {
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
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "patientname2"),
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed3"));
						//Thread.sleep(5000);
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	@Test(priority = 4, description = "Age should be in Numbers")
	public void TC16() throws IOException {
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed4"));
						//Thread.sleep(5000);
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	@Test(priority = 5, description = "Age do not contains characters")
	public void TC17() throws IOException {
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
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "age1"),
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed5"));
						//Thread.sleep(5000);
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	@Test(priority = 6, description = "Age do not contains special characters")
	public void TC18() throws IOException {
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
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "age2"),
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed6"));
				//Thread.sleep(5000);
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}
	
	@Test(priority = 7, description = "DOB should be in dd/mm/yyyy format")
	public void TC19() throws IOException {
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed7"));
				//Thread.sleep(5000);
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
			
	}

	@Test(priority = 8, description = "DOB should not accept mm/dd/yyyy format")
	public void TC20() throws IOException {
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
						PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dob1"),
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
						addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed8"));
						//Thread.sleep(5000);
				
				addNewPatientPA.clickAddPatientBtn();
					
				reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
			} catch (Exception e) {
				reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
			}
	}
			

		@Test(priority = 9, description = "DOB should not accept yyyy/mm/dd format")
		public void TC21() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "dob2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed9"));
							//Thread.sleep(5000);
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		

		@Test(priority = 10, description = "Lenght of contact number should be 10")
		public void TC22() throws IOException {
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed10"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 11, description = "Lenght of contact number not should be less than 10")
		public void TC23() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact1"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed11"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 12, description = "Lenght of contact number not should be greater than 10")
		public void TC24() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed12"));
							//Thread.sleep(5000);
							
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 13, description = "Contact number not should not contains alphabates")
		public void TC25() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact3"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed13"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 14, description = "Contact number not should not contains special characters")
		public void TC26() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact4"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed14"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
				
		@Test(priority = 15, description = "Contact number not should not contains white spaces")
		public void TC27() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "contact5"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed15"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
				
		

		@Test(priority = 16, description = "Lenght of Alt contact number should be 10")
		public void TC28() throws IOException {
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed16"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 17, description = "Lenght of Alt contact number not should be less than 10")
		public void TC29() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact1"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed17"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 18, description = "Lenght of Alt contact number not should be greater than 10")
		public void TC30() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed18"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 19, description = "Alt Contact number not should not contains alphabates")
		public void TC31() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact3"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed19"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
		
		@Test(priority = 20, description = "Alt Contact number not should not contains special characters")
		public void TC32() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact4"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed20"));
							//Thread.sleep(5000);
							
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
				
		@Test(priority = 21, description = "Alt Contact number not should not contains white spaces")
		public void TC33() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "alternatecontact5"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed21"));
							//Thread.sleep(5000);
							
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
	}
				

		@Test(priority = 22, description = "address accepts alphabates")
		public void TC34() throws IOException {
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed22"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		

		@Test(priority = 23, description = "Address do not accept numbers")
		public void TC35() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "address1"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed23"));
							//Thread.sleep(5000);
							
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		@Test(priority = 24, description = "Address do not accept Special Characters")
		public void TC36() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "address2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed24"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}

		@Test(priority = 25, description = "District accepts alphabates")
		public void TC37() throws IOException {
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed25"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		

		@Test(priority = 26, description = "District do not accept numbers")
		public void TC38() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "district1"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed26"));
							//Thread.sleep(5000);
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		@Test(priority = 27, description = "District do not accept Special Characters")
		public void TC39() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "district2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed27"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}

		@Test(priority = 28, description = "Pincode accepts numbers")
		public void TC40() throws IOException {
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed28"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		

		@Test(priority = 29, description = "Pincode accept numbers")
		public void TC41() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pincode1"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed29"));
							//Thread.sleep(5000);
					
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
		@Test(priority = 30, description = "Pincode do not accept Special Characters")
		public void TC42() throws IOException {
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
							PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "pincode2"),
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
							addNewPatientPA.selectadBed(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "bed30"));
							//Thread.sleep(5000);
							
					addNewPatientPA.clickAddPatientBtn();
						
					reporterLogger.log(LogStatus.PASS, reporterLogger.addScreenCapture(screenCapture(driver))+ "Test Passed");
				} catch (Exception e) {
					reporterLogger.log(LogStatus.FAIL, reporterLogger.addScreenCapture(screenCapture(driver))+ e.getMessage());
				}
				
		}
		
}// End - Class
	