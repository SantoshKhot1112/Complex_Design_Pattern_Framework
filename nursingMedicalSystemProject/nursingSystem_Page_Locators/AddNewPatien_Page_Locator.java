package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPatien_Page_Locator {
	
	WebDriver driver = null;
	public AddNewPatien_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//pd for Personal Details Tab. Below are the Locators from the Personal Details forms
	//Login - Patient Management - InPatient Registration - Personal Details Tab
	
	@FindBy(xpath = "//input[@id='file']") 
	private WebElement pdPhoto;
	public WebElement getpdPhoto() {
		return pdPhoto;
	}
	
	@FindBy(id = "UHID")
	private WebElement pdUHID;
	public WebElement getpdUHID() {
		return pdUHID;
	}
	
	@FindBy(id = "Name")
	private WebElement pdName;
	public WebElement getpdName() {
		return pdName;
	}
	
	@FindBy(id = "Age")
	private WebElement pdAge;
	public WebElement getpdAge() {
		return pdAge;
	}
	
	@FindBy(id = "DOB")
	private WebElement pdDOB;
	public WebElement getpdDOB() {
		return pdDOB;
	}
	
	@FindBy(id = "Gender")
	private WebElement pdGender;
	public WebElement getGender() {
		return pdGender;
	}
	
	@FindBy(id = "Religion")
	private WebElement pdReligion;
	public WebElement getpdReligion() {
		return pdReligion;
	}
	
	@FindBy(id = "Nationality")
	private WebElement pdNationality;
	public WebElement getpdNationality() {
		return pdNationality;
	}
	
	@FindBy(id = "Guardian")
	private WebElement pdGuardian;
	public WebElement getpdGuardian() {
		return pdGuardian;
	}
	
	@FindBy(id = "GuardianRelation")
	private WebElement pdGuardianRelation;
	public WebElement getpdGuardianRelation() {
		return pdGuardianRelation;
	}
	
	@FindBy(id = "MaritalStatus")
	private WebElement pdMaritalStatus;
	public WebElement getMaritalStatus() {
		return pdMaritalStatus;
	}
	
	@FindBy(xpath = "//button[@id='btnPersonalNext']")
	private WebElement pdNextBtn;
	public WebElement getNextBtn() {
		return pdNextBtn;
	}
	
	
	//cd for Contact Details Tab. Below are the Locators from the Contact Details forms
	//Login - Patient Management - InPatient Registration - Contact Details Tab
	
	//@FindBy(linkText = "Contact Details")
	@FindBy(xpath = "//a[@id='contactTab']")
	private WebElement cdContactDetailsTab;
	public WebElement getContactDetailsTab() {
		return cdContactDetailsTab;
	}
	
	//@FindBy(id = "Contact")
	@FindBy(xpath = "//input[@id='Contact']")
	private WebElement cdContact;
	public WebElement getcdContact() {
		return cdContact;
	}
	
	//@FindBy(id = "AltContact")
	@FindBy(xpath = "//input[@id='AltContact']")
	private WebElement cdAltContact;
	public WebElement getcdAltContact() {
		return cdAltContact;
	}
	
	@FindBy(xpath = "//input[@id='Address']")
	private WebElement cdAddress;
	public WebElement getcdAddress() {
		return cdAddress;
	}
	
	@FindBy(xpath = "//input[@id='District']")
	private WebElement cdDistrict;
	public WebElement getcdDistrict() {
		return cdDistrict;
	}
	
	@FindBy(xpath = "//input[@id='Pincode']")
	private WebElement cdPincode;
	public WebElement getcdPincode() {
		return cdPincode;
	}
	
	@FindBy(xpath = "//input[@id='PoliceStation']")
	private WebElement cdPoliceStation;
	public WebElement getcdPoliceStation() {
		return cdPoliceStation;
	}
	
	@FindBy(xpath = "//input[@id='PostOffice']")
	private WebElement cdPostOffice;
	public WebElement getcdPostOffice() {
		return cdPostOffice;
	}
	
	@FindBy(xpath = "//button[@id='btnContactNext']")
	private WebElement cdNextBtn;
	public WebElement getcdNextBtn() {
		return cdNextBtn;
	}
	
	
	//nd for Health Details Tab. Below are the Locators from the Health Details forms
	//Login - Patient Management - InPatient Registration - Health Details Tab
		
	@FindBy(xpath = "//input[@id='Weight']")
	private WebElement hdWeight;
	public WebElement gethdWeight() {
		return hdWeight;
	}
	
	@FindBy(xpath = "//input[@id='Height']")
	private WebElement hdHeight;
	public WebElement gethdHeight() {
		return hdHeight;
	}
	
	@FindBy(xpath = "//input[@id='BP']")
	private WebElement hdBP;
	public WebElement gethdBP() {
		return hdBP;
	}
	
	@FindBy(xpath = "//input[@id='Pulse']")
	private WebElement hdPulse;
	public WebElement gethdPulse() {
		return hdPulse;
	}
	
	@FindBy(xpath = "//input[@id='SPO2']")
	private WebElement hdSPO2;
	public WebElement gethdSPO2() {
		return hdSPO2;
	}
	
	@FindBy(xpath = "//textarea[@id='ProvisionalDiagnosis']")
	private WebElement hdProvisionalDiagnosis;
	public WebElement gethdProvisionalDiagnosis() {
		return hdProvisionalDiagnosis;
	}
	
	@FindBy(id = "InsurenceCompanyID")
	private WebElement hdInsuranceCompany;
	public WebElement getInsuranceCompany() {
		return hdInsuranceCompany;
	}
	
	@FindBy(id = "HealthCardId")
	private WebElement hdTPA;
	public WebElement getTPA() {
		return hdTPA;
	}
	
		
	@FindBy(xpath = "//input[@id='HealthCardNo']")
	private WebElement hdClaim;
	public WebElement getClaimNo() {
		return hdClaim;
	}
	
	@FindBy(xpath = "//input[@id='PolicyNo']")
	private WebElement hdPolicyNo;
	public WebElement getPolicyNo() {
		return hdPolicyNo;
	}
	
	
	@FindBy(xpath = "//button[@id='btnHealthNext']")
	private WebElement hdNextBtn;
	public WebElement gethdNextBtn() {
		return hdNextBtn;
	}
	
	
	//ad for Admission Details Tab. Below are the Locators from the Admission Details forms
	//Login - Patient Management - InPatient Registration - Admission Details Tab
		
	@FindBy(id = "AdmissionDate")
	private WebElement adAdmissionDate;
	public WebElement getadAdmissionDate() {
		return adAdmissionDate;
	}
		
	@FindBy(id = "AdmissionTime")
	private WebElement adAdmissionTime;
	public WebElement getadAdmissionTime() {
		return adAdmissionTime;
	}
	
	@FindBy(xpath = "//input[@id='ReferredBy']")
	private WebElement adReferredBy;
	public WebElement getadReferredBy() {
		return adReferredBy;
	}
	
	@FindBy(id="DoctorID")
	private WebElement adUnderDoctor;
	public WebElement getadUnderDoctor() {
		return adUnderDoctor;
	}
		
	@FindBy(xpath = "//input[@id='Case']")
	private WebElement adCase;
	public WebElement getadCase() {
		return adCase;
	}
	
	@FindBy(xpath = "//input[@id='FIR']")
	private WebElement adFIR;
	public WebElement getadFIR() {
		return adFIR;
	}
	
	@FindBy(xpath = "//select[@id='RoomID']")
	private WebElement adRoom;
	public WebElement getadRoom() {
		return adRoom;
	}
	
	//@FindBy(xpath = "//select[@id='BedID']")
	@FindBy(id="BedID")
	private WebElement Bed;
	public WebElement getBed() {
		return Bed;	
	}
	
		
	//@FindBy(id = "SaveBtn")
	@FindBy(xpath = "//input[@id='SaveBtn']")
	private WebElement addBtn;
	public WebElement getAddPatientBtn() {
		return addBtn;
	}
	
}// End Class
