package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPages;

public class LoginPageTest extends TestBase {
	
	LoginPages login;// = new LoginPages();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPages();
	}
	
	@Test
	public void veriftyTitleTest() throws Exception
	{
		String ExpTitle = "Swag Labs";
		String actualTitle = login.VerifyTitle();
		Assert.assertEquals(ExpTitle, actualTitle);
		System.out.println(actualTitle);
	}
	@Test
	public void verifyUrlTest() throws Exception
	{
		String Expurl = "https://www.saucedemo.com/";
		String actuurl = login.verifyUrl();
		Assert.assertEquals(Expurl, actuurl);
		System.out.println(login.verifyUrl());
	}
	@Test
	public void verifyMainLogoTest()
	{
		boolean mainLogo = login.verifyMainLogo();
		Assert.assertEquals(mainLogo, true);
	}
	@Test
	public void verifyBotLogoTest()
	{
		boolean botLogo = login.verifyBotLogo();
		Assert.assertEquals(botLogo, true);
	}
	@Test
	public void verifyuserNameBoxDisplay()
	{
		boolean IsDisplay = login.userNameBoxDisplay();
		Assert.assertEquals(IsDisplay, true);		
	}
	@Test
	public void verifyuserNameBoxEnable()
	{
		boolean IsEnable = login.userNameBoxDisplay();
		Assert.assertEquals(IsEnable, true);
	}
	@Test
	public void verifyuserNameBoxSelected()
		{
			boolean IsSelected = login.userNameBoxSelected();
			Assert.assertEquals(IsSelected, false);		
		}
	@Test
	public void verifypasswordBoxDisplay()
	{
		boolean passBoxDisplay = login.passwordBoxDisplay();
		Assert.assertEquals(passBoxDisplay, true);
	}
	@Test
	public void verifypasswordBoxEnable()
	{
		boolean passBoxEnable = login.passwordBoxEnable();
		Assert.assertEquals(passBoxEnable, true);
	}
	@Test
	public void verifyloginBoxDisplay()
	{
		boolean logBoxDisplay = login.loginBoxDisplay();
		Assert.assertEquals(logBoxDisplay, true);
	}
	@Test
	public void verifyloginBoxEnable()
	{
		boolean logBoxEnable = login.loginBoxEnable();
		Assert.assertEquals(logBoxEnable, true);
	}
	@Test
	public void getErrorMessagePass() throws Exception 
	{   //If we Pass The Correct User Name But Incorect Password. We Got Error.
		login.sendUserNameInBox();
		login.SendInCorrectPasswordInBox();
		login.clickLoginButton();
		Object errorBox = login.getErrorMessageDisplay();
		Assert.assertEquals(errorBox, true);
		String Expecstr = "Epic sadface: Username and password do not match any user in this service";
		String actualstr = (String) login.getErrorMessage();
		Assert.assertEquals(actualstr, Expecstr);
		System.out.println(login.getErrorMessage());
		Thread.sleep(3000);
	}
	@Test
	public void getErrorMessageuser() throws Exception 
	{   //If we Pass The InCorrect User Name But corect Password. We Got Error.
		login.SendInCorrectUsernameInBox();
		login.sendPasswordInBox();
		login.clickLoginButton();
		Object errorBox = login.getErrorMessageDisplay();
		Assert.assertEquals(errorBox, true);
		String Expecstr = "Epic sadface: Username and password do not match any user in this service";
		String actualstr = (String) login.getErrorMessage();
		Assert.assertEquals(actualstr, Expecstr);
		System.out.println(login.getErrorMessage());
		Thread.sleep(3000);
	}
	@Test
	public void getErrorMessageuser1() throws Exception 
	{   //If we Pass The Correct User Name But Incorect Password. We Got Error.
		//Error message: -Epic sadface: Username is required
		login.sendPasswordInBox();
		login.clickLoginButton();
		Object errorBox = login.getErrorMessageDisplay();
		Assert.assertEquals(errorBox, true);
		String Expecstr = "Epic sadface: Username is required";
		String actualstr = (String) login.getErrorMessage();
		Assert.assertEquals(actualstr, Expecstr);
		System.out.println(login.getErrorMessage());
		Thread.sleep(3000);
	}
	@Test
	public void getErrorMessagePass1() throws Exception 
	{   //If we Pass The Correct User Name But Incorect Password. We Got Error.
		login.sendUserNameInBox();
		login.clickLoginButton();
		Object errorBox = login.getErrorMessageDisplay();
		Assert.assertEquals(errorBox, true);
		String Expecstr = "Epic sadface: Password is required";
		String actualstr = (String) login.getErrorMessage();
		Assert.assertEquals(actualstr, Expecstr);
		System.out.println(login.getErrorMessage());
		Thread.sleep(3000);
	}
	@Test
	public void getOpenInventryPage() throws Exception 
	{  
		login.sendUserNameInBox();
		login.sendPasswordInBox();
		login.clickLoginButton();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	

}
