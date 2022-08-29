package nursingSystem_Page_Actions;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionsWeb.WebButton;
import commonFunctionsWeb.WebDropDown;
import commonFunctionsWeb.WebElementCommon;
import commonFunctionsWeb.WebTextBox;
import nursingSystem_Page_Locators.AddNewPatien_Page_Locator;

public class AddNewPatient_Page_Action {
	public WebDriver driver = null;
	//WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(2));
	public ExtentTest reporterLogger = null;
	AddNewPatien_Page_Locator addNewPatientPL = null;
	
	public AddNewPatient_Page_Action(WebDriver driver, ExtentTest reporterLogger) {
		this.driver = driver;
		this.reporterLogger = reporterLogger;
		addNewPatientPL = new AddNewPatien_Page_Locator(driver);
	}
	
/*	
	public void uploadPhoto(String photo) {
		if (addNewPatientPL.getpdPhoto()!=null) {
			WebTextBox.sendInput(addNewPatientPL.getpdPhoto(), photo);
			
			if(WebElementCommon.isClickable(addNewPatientPL.getpdPhoto())) {
				//addNewPatientPL.getpdPhoto().sendKeys("C://Users//HP//Desktop//test.jpg");
			//WebButton.buttonClick(addNewPatientPL.getpdPhoto());
				WebTextBox.sendInput(addNewPatientPL.getpdPhoto(), photo);
				
				reporterLogger.log(LogStatus.PASS, "Photo Uploaded Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Photo not Uploaded");
			}
			
		}
	}
*/	
	// Below are the Actions on Locators from the Personal Details Form/Tab
	
	public void enterpdUHID(String uhid) {
		if(addNewPatientPL.getpdUHID()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdUHID())) {
				WebTextBox.sendInput(addNewPatientPL.getpdUHID(), uhid);
				reporterLogger.log(LogStatus.PASS, "UHID Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "UHID not Entered");
			}
		}
	}
	
	public void enterpdName(String name) {
		if(addNewPatientPL.getpdName()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdName())) {
				WebTextBox.sendInput(addNewPatientPL.getpdName(), name);
				reporterLogger.log(LogStatus.PASS, "Name Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Name not Entered");
			}
		}
	}
	
	public void enterpdAge(String age) {
		if(addNewPatientPL.getpdAge()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdAge())) {
				WebTextBox.sendInput(addNewPatientPL.getpdAge(), age);
				reporterLogger.log(LogStatus.PASS, "Age Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Age not Entered");
			}
		}
	}
	
	public void enterpdDOB(String dob) {
		if(addNewPatientPL.getpdDOB()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdDOB())) {
				WebTextBox.sendInput(addNewPatientPL.getpdDOB(), dob);
				reporterLogger.log(LogStatus.PASS, "DOB Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "DOB not Entered");
			}
		}
	}	
	
	public void selectGenderOptions(String text) {
		if(addNewPatientPL.getGender()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getGender(), text);
			reporterLogger.log(LogStatus.PASS, "Gender Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Gender Option not Selected");
		}
	}
	
	public void selectReligionOptions(String text) {
		if(addNewPatientPL.getpdReligion()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getpdReligion(), text);
			reporterLogger.log(LogStatus.PASS, "Religion Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Religion Option not Selected");
		}
	}
	
	public void enterpdNationality(String nationality) {
		if(addNewPatientPL.getpdNationality()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdNationality())) {
				WebTextBox.sendInput(addNewPatientPL.getpdNationality(), nationality);
				reporterLogger.log(LogStatus.PASS, "Nationality Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Nationality not Entered");
			}
		}
	}
	
	public void enterpdGuardian(String guardian) {
		if(addNewPatientPL.getpdGuardian()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdGuardian())) {
				WebTextBox.sendInput(addNewPatientPL.getpdGuardian(), guardian);
				reporterLogger.log(LogStatus.PASS, "Guardian Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Guardian not Entered");
			}
		}
	}
	
	public void enterpdGuardianRelation(String guardianrelation) {
		if(addNewPatientPL.getpdGuardianRelation()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getpdGuardianRelation())) {
				WebTextBox.sendInput(addNewPatientPL.getpdGuardianRelation(), guardianrelation);
				reporterLogger.log(LogStatus.PASS, "Guardian Relation Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Guardian Relation not Entered");
			}
		}
	}
	
	public void selectMaritalStatusOptions(String text) {
		if(addNewPatientPL.getMaritalStatus()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getMaritalStatus(), text);
			reporterLogger.log(LogStatus.PASS, "Marital Status Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Marital Status Option not Selected");
		}
	}
	
	public void ClickNext() {
		if(addNewPatientPL.getNextBtn()!=null) {
			WebButton.buttonClick(addNewPatientPL.getNextBtn());
			reporterLogger.log(LogStatus.PASS, "Next Button Clicked Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Next Button not Clicked");
		}
	}
	
/*
	public void clickContactDetailsTab() {
		if(addNewPatientPL.getContactDetailsTab()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getContactDetailsTab())) {
				WebLink.linkClick(addNewPatientPL.getContactDetailsTab());
			}
		}
	}
*/
	
	//Common Function - Personal Details form Actions	
	
	public void commonpdfunction(String uhid, String name, String age, String dob, String genderLink, String religion, String nationality, 
			String guardian, String guardianrelation, String maritalLink) {
		//enterpdUHID(uhid);
		//uploadPhoto(photo);
		enterpdName(name);
		enterpdAge(age);
		enterpdDOB(dob);
		selectGenderOptions(genderLink);
		selectReligionOptions(religion);
		enterpdNationality(nationality);
		enterpdGuardian(guardian);
		enterpdGuardianRelation(guardianrelation);
		selectMaritalStatusOptions(maritalLink);
		
		
	}
	
	// Below are the Actions on Locators from the Contact Details Form/Tab
	
	public void entercdContact(String contact) {
		if (addNewPatientPL.getcdContact()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdContact())) {
				WebTextBox.sendInput(addNewPatientPL.getcdContact(), contact);
				reporterLogger.log(LogStatus.PASS, "Contact Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Contact not Entered");
			}
			
		}
	}
	
	public void entercdAltContact(String contact) {
		if (addNewPatientPL.getcdAltContact()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdAltContact())) {
				WebTextBox.sendInput(addNewPatientPL.getcdAltContact(), contact);
				reporterLogger.log(LogStatus.PASS, "Alternate Contact Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Alternate Contact not Entered");
			}
			
		}
	}
	
	public void entercdAddress(String address) {
		if (addNewPatientPL.getcdAddress()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdAddress())) {
				WebTextBox.sendInput(addNewPatientPL.getcdAddress(), address);
				reporterLogger.log(LogStatus.PASS, "Address Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Address not Entered");
			}
			
		}
	}
	
	public void entercdDistrict(String district) {
		if (addNewPatientPL.getcdDistrict()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdDistrict())) {
				WebTextBox.sendInput(addNewPatientPL.getcdDistrict(), district);
				reporterLogger.log(LogStatus.PASS, "District Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "District not Entered");
			}
			
		}
	}
	
	public void entercdPincode(String pincode) {
		if (addNewPatientPL.getcdPincode()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdPincode())) {
				WebTextBox.sendInput(addNewPatientPL.getcdPincode(), pincode);
				reporterLogger.log(LogStatus.PASS, "Pincode Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Pincode not Entered");
			}
			
		}
	}
	
	public void entercdPoliceStaion(String policeStation) {
		if (addNewPatientPL.getcdPoliceStation()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdPoliceStation())) {
				WebTextBox.sendInput(addNewPatientPL.getcdPoliceStation(), policeStation);
				reporterLogger.log(LogStatus.PASS, "Police Station Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Police Station not Entered");
			}
			
		}
	}
	
	public void entercdPostOffice(String postOffice) {
		if (addNewPatientPL.getcdPostOffice()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdPostOffice())) {
				WebTextBox.sendInput(addNewPatientPL.getcdPostOffice(), postOffice);
				reporterLogger.log(LogStatus.PASS, "Post Office Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Post Office not Entered");
			}
			
		}
	}
	
	public void ClickcdNext() {
		if(addNewPatientPL.getcdNextBtn()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getcdPostOffice())) {
				WebButton.buttonClick(addNewPatientPL.getcdNextBtn());
				reporterLogger.log(LogStatus.PASS, "Next Button Clicked Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Next Button not Clicked");
			}
	   }
	}
	
	//Common Function -  Contact Details form Actions 
	
	public void commonCDFunction(String contact, String altContact, String address, String dist, String pin, String police, String post) {
		
		entercdContact(contact);
		entercdAltContact(altContact);
		entercdAddress(address);
		entercdDistrict(dist);
		entercdPincode(pin);
		entercdPoliceStaion(police);
		entercdPostOffice(post);
	}
	

	// Below are the Actions on Locators from the Health Details Form/Tab

	public void enterhdWeight(String weight) {
		if (addNewPatientPL.gethdWeight()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdWeight())) {
				WebTextBox.sendInput(addNewPatientPL.gethdWeight(), weight);
				reporterLogger.log(LogStatus.PASS, "Weight Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Weight not Entered");
			}
			
		}
	}
	
	public void enterhdHeight(String height) {
		if (addNewPatientPL.gethdHeight()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdHeight())) {
				WebTextBox.sendInput(addNewPatientPL.gethdHeight(), height);
				reporterLogger.log(LogStatus.PASS, "Height Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Height not Entered");
			}
			
		}
	}
	
	public void enterhdBP(String bp) {
		if (addNewPatientPL.gethdBP()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdBP())) {
				WebTextBox.sendInput(addNewPatientPL.gethdBP(), bp);
				reporterLogger.log(LogStatus.PASS, "BP Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "BP not Entered");
			}
			
		}
	}
	
	public void enterhdPulse(String pulse) {
		if (addNewPatientPL.gethdPulse()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdPulse())) {
				WebTextBox.sendInput(addNewPatientPL.gethdPulse(), pulse);
				reporterLogger.log(LogStatus.PASS, "Pulse Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Pulse not Entered");
			}
			
		}
	}
	
	public void enterhdSPO2(String spo2) {
		if (addNewPatientPL.gethdSPO2()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdSPO2())) {
				WebTextBox.sendInput(addNewPatientPL.gethdSPO2(), spo2);
				reporterLogger.log(LogStatus.PASS, "SPO2 Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "SPO2 not Entered");
			}
			
		}
	}
	
	public void enterhdProDiagnosis(String proDiagnosis) {
		if (addNewPatientPL.gethdProvisionalDiagnosis()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdProvisionalDiagnosis())) {
				WebTextBox.sendInput(addNewPatientPL.gethdProvisionalDiagnosis(), proDiagnosis);
				reporterLogger.log(LogStatus.PASS, "Prov. Diagnosis Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Prov. Diagnosis not Entered");
			}
			
		}
	}
	
	public void selectInsurenceCompany(String insuranceCompany) {
		if(addNewPatientPL.getInsuranceCompany()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getInsuranceCompany(), insuranceCompany);
			reporterLogger.log(LogStatus.PASS, "Insurance Company Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Insurance Company Option not Selected");
		}
	}
	
	public void selectTPA(String tpa) {
		if(addNewPatientPL.getTPA()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getTPA(), tpa);
			reporterLogger.log(LogStatus.PASS, "TPA Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "TPA Option not Selected");
		}
	}
	
	public void enterClaimNo(String claim) {
		if (addNewPatientPL.getClaimNo()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getClaimNo())) {
				WebTextBox.sendInput(addNewPatientPL.getClaimNo(), claim);
				reporterLogger.log(LogStatus.PASS, "Claim Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Claim not Entered");
			}
			
		}
	}
	
	
	public void enterPolicyNo(String policyNo) {
		if (addNewPatientPL.getPolicyNo()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getPolicyNo())) {
				WebTextBox.sendInput(addNewPatientPL.getPolicyNo(), policyNo);
				reporterLogger.log(LogStatus.PASS, "Policy No Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Policy No not Entered");
			}
			
		}
	}
	
	public void ClickhdNext() {
		if(addNewPatientPL.gethdNextBtn()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.gethdNextBtn())) {
				WebButton.buttonClick(addNewPatientPL.gethdNextBtn());
				reporterLogger.log(LogStatus.PASS, "Next Button Clicked Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Next Button not Clicked");
			}
	   }
	}
	
	//Common Function - Health Details form Actions		
	public void commonHDFunction(String weight, String height, String bp, String pulse, String spo2,
			String proDiagnosis, String insuranceCompany, String tpa, String claim, String PolicyNo) {
		
		enterhdWeight(weight);
		enterhdHeight(height);
		enterhdBP(bp);
		enterhdPulse(pulse);
		enterhdSPO2(spo2);
		enterhdProDiagnosis(proDiagnosis);
		selectInsurenceCompany(insuranceCompany);
		selectTPA(tpa);
		enterClaimNo(claim);
		enterPolicyNo(PolicyNo);
	}
	
	
	// Below are the Actions on Locators from the Admission Details Form/Tab

	public void enteradAdmissionDate(String date) {
		if(addNewPatientPL.getadAdmissionDate()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getadAdmissionDate())) {
				WebTextBox.clearText(addNewPatientPL.getadAdmissionDate());
				WebTextBox.sendInput(addNewPatientPL.getadAdmissionDate(), date);
				reporterLogger.log(LogStatus.PASS, "Admission Date Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Admission Date not Entered");
			}
		}
	}
	
	public void enteradAdmissionTime(String time) {
		if(addNewPatientPL.getadAdmissionTime()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getadAdmissionTime())) {
				WebTextBox.clearText(addNewPatientPL.getadAdmissionTime());
				WebTextBox.sendInput(addNewPatientPL.getadAdmissionTime(), time);
				reporterLogger.log(LogStatus.PASS, "Admission Time  Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Admission Time  not Entered");
			}
		}
	}
	
	public void enteradReferredBy(String referredby) {
		if(addNewPatientPL.getadReferredBy()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getadReferredBy())) {
				WebTextBox.sendInput(addNewPatientPL.getadReferredBy(), referredby);
				reporterLogger.log(LogStatus.PASS, "Referred By Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Referred By Date not Entered");
			}
		}
	}
	
	public void selectadUnderDoctor(String dr) {
		if(addNewPatientPL.getadUnderDoctor()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getadUnderDoctor(), dr);
			reporterLogger.log(LogStatus.PASS, "Under Doctor Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Under Doctor Option not Selected");
		}
	}
	
	public void enteradCase(String caseText) {
		if (addNewPatientPL.getadCase()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getadCase())) {
				WebTextBox.sendInput(addNewPatientPL.getadCase(), caseText);
				reporterLogger.log(LogStatus.PASS, "Case Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "Case not Entered");
			}
			
		}
	}
	
	
	public void enteradFIR(String fir) {
		if (addNewPatientPL.getadFIR()!=null) {
			if(WebElementCommon.isClickable(addNewPatientPL.getadFIR())) {
				WebTextBox.sendInput(addNewPatientPL.getadFIR(), fir);
				reporterLogger.log(LogStatus.PASS, "FIR Entered Successfully");
			}else {
				reporterLogger.log(LogStatus.FAIL, "FIR not Entered");
			}
			
		}
	}
	
	public void selectadRoom(String room) {
		if(addNewPatientPL.getadRoom()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getadRoom(), room);
			reporterLogger.log(LogStatus.PASS, "Room Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Room Option not Selected");
		}
	}
	
	/*
	public void selectadBed(String bed) {
		if(addNewPatientPL.getadBed()!=null) {
			WebDropDown.dropDown(addNewPatientPL.getadBed(), bed);
			reporterLogger.log(LogStatus.PASS, "Bed Option Selected Successfully");
		}else {
			reporterLogger.log(LogStatus.FAIL, "Bed Option not Selected");
		}
	}
	*/
	
	public void selectadBed(String beds) {
		if(addNewPatientPL.getBed()!=null) {
            WebDropDown.dropDown(addNewPatientPL.getBed(), beds);
            reporterLogger.log(LogStatus.PASS, " Bed Selected Successfully");
        }else {
        	reporterLogger.log(LogStatus.FAIL, " Bed not Selected");
        }
	}
	
	
	
	
	//Common Function - Admission Details form Actions
	
	public void commonADFunction(String date, String time, String referredby, String dr, String caseText,
			String fir, String room, String bed) {
		
		enteradAdmissionDate(date);
		enteradAdmissionTime(time);
		enteradReferredBy(referredby);
		selectadUnderDoctor(dr);
		enteradCase(caseText);
		enteradFIR(fir);
		selectadRoom(room);
		selectadBed(bed);
		
	}
	
	public void clickAddPatientBtn() {
		if(addNewPatientPL.getAddPatientBtn()!=null) {
		//	if(WebElementCommon.isClickable(addNewPatientPL.getAddPatientBtn())) {
				WebButton.buttonClick(addNewPatientPL.getAddPatientBtn());
				reporterLogger.log(LogStatus.PASS, " Add Patient Button Clicked Successfully");
        }else {
        	reporterLogger.log(LogStatus.FAIL, " Add Patient Button not Clicked");
        }
		
	}
	
} // Class End
