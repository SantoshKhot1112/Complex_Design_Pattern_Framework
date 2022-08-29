package initializerFunctions;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import commonFunctionsWeb.WebBrowser;
import dataSource.PropertiesReader;
import reporter.GraphicalReport;

public class BaseClass extends GraphicalReport{
	public static WebDriver driver = null;

/*
 * 
 * Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String newdate = dateFormat.format(date);
		String nDate = "";
		int i=0;
		while(i<newdate.length()) {
			if(newdate.charAt(i)!=32) {
				nDate=nDate+newdate.charAt(i);
			}
			i++;
		}
		nDate=nDate+".html";
 */
	
	@BeforeSuite
	public void beforeSuitStart() throws IOException {
		
		graphicalReport = new ExtentReports(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "reportPath"), true);
		//graphicalReport = new ExtentReports(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "reportPath1"+nDate+".html"), true);
	}
	@BeforeMethod
	public void beforeEachTestCase(Method testMethod) throws IOException {
		reporterLogger = graphicalReport.startTest(testMethod.getName());
	//	String browserName = PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "browser");
		driver = WebBrowser.openBrowser(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "browser"));
		//driver.get("https://www.knowledgeware.in/final.html");
		driver.get(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AUT"));
	}
	
	@AfterMethod
	public void afterEachTestCase() {
	//	driver.close();
		graphicalReport.endTest(reporterLogger);
		graphicalReport.flush();
	}
}
