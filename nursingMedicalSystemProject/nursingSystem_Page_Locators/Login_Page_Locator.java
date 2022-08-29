package nursingSystem_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locator {
	public WebDriver driver = null;
	public Login_Page_Locator(WebDriver driver) { // Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Username")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id = "Password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
