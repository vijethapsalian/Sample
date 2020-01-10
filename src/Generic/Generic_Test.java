package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Framework_constants {
public	WebDriver driver;
@BeforeMethod
public void openApplcn()
{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	 driver=new FirefoxDriver();
	 driver.get("http://localhost/login.do");
}
@AfterMethod()
public void closeApplcn(ITestResult res) throws IOException, InterruptedException
{
	int status = res.getStatus();
	if(status==2)
	{
		Generic_Screenshot.getPhoto(driver);;
	}
	Thread.sleep(3000);
driver.quit();	
}

}
