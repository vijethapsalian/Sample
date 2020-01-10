package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test1 {
	static ExtentReports report;
	static ExtentTest test;	
	@BeforeClass
	public void startTest()
	{
	 report=new ExtentReports("./Extent/r.html",false);
	 test=report.startTest("test1");	
	}
@Test
public void Demo1()
{
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
if(driver.getTitle().equals("Google"))
{
	test.log(LogStatus.PASS, "details");
}
else 
{
	test.log(LogStatus.FAIL, "Test Failed");
}
driver.close();
}

@AfterClass
public void endTest()
{
	report.endTest(test);
	report.flush();
}
}

