package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_acti {
@FindBy(id="username")
private WebElement userTbx;

@FindBy(name="pwd")
private WebElement pwdTbx;

@FindBy(xpath="//div[.='Login ']")
private WebElement loginBtn;

public login_acti(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void sendUser(String user)
{
	userTbx.sendKeys(user);
}
public void sendPwd(String pwd)
{
	pwdTbx.sendKeys(pwd);
}
public void clickLogin()
{
	loginBtn.click();
}	
}
