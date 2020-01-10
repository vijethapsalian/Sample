package ExtentReports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {
@Test
public void Sample()
{
	ExtentReports report=new ExtentReports("./Extent/r1.html",false);
	ExtentTest test=report.startTest("Test2");
	test.log(LogStatus.PASS, "Pass");
	test.log(LogStatus.FAIL, "fail");
	test.log(LogStatus.SKIP, "skip");
	report.endTest(test);
	report.flush();
	
}
	
}
