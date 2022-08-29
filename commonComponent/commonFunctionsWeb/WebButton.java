package commonFunctionsWeb;

import org.openqa.selenium.WebElement;

public class WebButton {
	public static void buttonClick(WebElement element) {
		if (WebElementCommon.isClickable(element)) {
			element.click();
		}
	}
}
