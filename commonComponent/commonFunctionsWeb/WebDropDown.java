package commonFunctionsWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
	public static void dropDown(WebElement element, String value) {
		if (WebElementCommon.isClickable(element)) {
			Select nameDrpDwn = new Select(element);
			nameDrpDwn.selectByVisibleText(value);
		}
	}

}
