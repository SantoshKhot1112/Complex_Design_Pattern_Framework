package commonFunctionsWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	public static WebDriver openBrowser(String browserName) {
		WebDriver driver = null;
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D://KnowledgeWare//Selenium//Complex_Design_Pattern_Framework//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
			break;
			
		case "firefox":
			driver =  new FirefoxDriver();
			break;
			
		case "edge":
			driver =  new EdgeDriver();
			break;


		default:
			System.setProperty("webdriver.chrome.driver", "D://KnowledgeWare//Selenium//Complex_Design_Pattern_Framework//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
			break;
		}
		return driver;
	}

}
