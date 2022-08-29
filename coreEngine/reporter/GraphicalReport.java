package reporter;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class GraphicalReport {
	public static ExtentTest reporterLogger;
	public static ExtentReports graphicalReport;
	
	public static String screenCapture(WebDriver driver) throws IOException {
		TakesScreenshot takeSS = (TakesScreenshot) driver;
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/fullPage.png");
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/fullPage.png"));
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}
}
