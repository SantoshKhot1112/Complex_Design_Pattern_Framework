package commonFunctionsWeb;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	public static void sendInput(WebElement textBox, String text) {
		if(WebElementCommon.isClickable(textBox)) {
			textBox.sendKeys(text);
		}
	}
	
	/*
	 * Desc -  Method used to clear text in to text box
	 * Param- WebElement
	 * Return- void
	 */
	
	public static void clearText(WebElement textBox) {
		if (WebElementCommon.isClickable(textBox)) {
			textBox.clear();
		}
	}

}
