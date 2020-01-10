package Data_provider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Test {
	public WebDriver driver;
@DataProvider(name="hi")
public Object[][] ReadData() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	Object[][] arr=(Object[][]) Dataprvdr.getData();
	return arr;
}
@BeforeMethod

public void openApplcn()
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
}
@Test(dataProvider="hi")
public void login(String user,String pwd) throws InterruptedException
{
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(user);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(5000);
	if(driver.getTitle().contains("Enter"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@AfterMethod
public void closeApplctn()
{
	driver.quit();
}
	
	
}
