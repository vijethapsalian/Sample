package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Generic.Extent_reports;
import Generic.Generic_Test;
import POM.login_acti;

public class Actitime_login extends Generic_Test {
	static ExtentReports report;
	public static ExtentTest test;
	WebDriver driver;
	@BeforeClass
	public void startTest()
	{
	 report=new ExtentReports("./Extent/r.html",false);
	 test=report.startTest("Actitime_login");	
	}
	
@Test
public void login() throws InterruptedException 
{
login_acti l=new login_acti(driver);
Thread.sleep(2000);
l.sendUser("admin");
l.sendPwd("manager");
l.clickLogin();
Thread.sleep(6000);
/*
if(driver.getTitle().contains("actiTIME"))
{
	 test.log(LogStatus.PASS, "details");
}
else
{
	 test.log(LogStatus.FAIL, "Test Failed");
}*/
}
@AfterClass
public void endTest()
{
	
	report.endTest(test);
	report.flush();
}

}
