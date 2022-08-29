package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page_Locator {
	public WebDriver driver = null;
	public Dashboard_Page_Locator(WebDriver driver) { // Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(linkText = "Patient Management")
	private WebElement patientMgtLink;
	public WebElement getPatientMgtLink() {
		return patientMgtLink;
	}
	
	@FindBy(linkText = "In-Patient Registration")
	private WebElement inPatientRegLink;
	public WebElement getInPatientRegLink() {
		return inPatientRegLink;
	}

}
