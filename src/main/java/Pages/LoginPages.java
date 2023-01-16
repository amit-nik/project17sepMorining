package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.annotations.VisibleForTesting;

import Base.TestBase;

public class LoginPages extends TestBase {
	
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UserName;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']" ) private WebElement LoginButton;
	@FindBy(xpath = "//h3[@data-test='error']") private WebElement ErrorMessage;
	
	public LoginPages()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyMainLogo()
	{
		return loginLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	public String VerifyTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	public String verifyUrl() throws Exception
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	public boolean userNameBoxDisplay()
	{
		return UserName.isDisplayed();
	}
	public boolean userNameBoxEnable()
	{
		return UserName.isEnabled();
	}
	public boolean userNameBoxSelected()
	{
		return UserName.isSelected();
	}
	public boolean passwordBoxDisplay()
	{
		return Password.isDisplayed();
	}
	public boolean passwordBoxEnable()
	{
		return Password.isEnabled();
	}
	public boolean loginBoxDisplay()
	{
		return LoginButton.isDisplayed();
	}
	public boolean loginBoxEnable()
	{
		return LoginButton.isEnabled();
	}
	public Object sendUserNameInBox()
	{
		UserName.sendKeys("standard_user");
		return UserName;
	}
	public Object sendPasswordInBox()
	{
		Password.sendKeys("secret_sauce");
		return Password;
	}
	public Object SendInCorrectUsernameInBox()
	{
		UserName.sendKeys("aaa");
		return UserName;
	}
	public Object SendInCorrectPasswordInBox()
	{
		Password.sendKeys("665");
		return Password;
	}
	public Object clickLoginButton()
	{
		LoginButton.click();
		return LoginButton;
	}
	public Object getErrorMessage()
	{
		return ErrorMessage.getText();
	}
	public Object getErrorMessageDisplay()
	{
		return ErrorMessage.isDisplayed();
	}
}
