package commonFunctionsWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebLink {
	public static void linkClick(WebElement element) {
		if (WebElementCommon.isClickable(element)) {
			element.click();
		}
	}
	
	public static void linkClick(WebDriver driver, String linkName) {
		WebElement element = driver.findElement(By.linkText(linkName));
		if(WebElementCommon.isClickable(element)) {
			element.click();
		}
	}
}
