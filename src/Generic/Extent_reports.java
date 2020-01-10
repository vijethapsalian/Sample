package Generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_reports {
	static ExtentReports report;
	public static ExtentTest test;
	WebDriver driver;
	@BeforeClass
	public void startTest(String tcname)
	{
	 report=new ExtentReports("./Extent/r.html",false);
	 test=report.startTest(tcname);	
	}
	
	@AfterClass
	public void endTest()
	{
		
		report.endTest(test);
		report.flush();
	}
	
	
}
