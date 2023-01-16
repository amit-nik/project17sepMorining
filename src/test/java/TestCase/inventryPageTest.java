package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.inventryPage;

public class inventryPageTest extends TestBase {

	inventryPage inventry;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		inventry = new inventryPage();
		inventry.swagLogin();
	}	
	@Test  (enabled = false)
	public void verifyInventryPageUrlTest() throws Exception
	{
//		String expecUrl = " https://www.saucedemo.com/inventory.html/";
//		String actuUrl = inventry.InventryPageUrl();
//		Assert.assertEquals(actuUrl, expecUrl);
		System.out.println(inventry.InventryPageUrl());
	}
	@Test  (enabled = false)
	public void verifyAppLogoTest() throws Exception
	{
		boolean appLogo = inventry.inventryAppLogo();
		AssertJUnit.assertEquals(appLogo, true);
	}
	@Test (enabled = false)
	public void verifyAppLogoTextTest() throws Exception
	{
//		System.out.println(inventry.inventryTagNametext());
		String actustr = "PRODUCTS";
		String expecstr = inventry.inventryTagNametext();	
		AssertJUnit.assertEquals(actustr, expecstr);		
	}
	@Test (enabled = false)
	public void verifyPeekLogoTest() throws Exception
	{
		boolean expecstr = inventry.peekLogo();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void verifyTwiterLinkTest() throws Exception
	{
		String actustr = "Twitter";
		String expecstr = inventry.twiterlink();	
		AssertJUnit.assertEquals(actustr, expecstr);		
	}
	@Test (enabled = false)
	public void VerifytwiterLogoVisibleTest() throws Exception
	{
		boolean expecstr = inventry.twiterLogoVisible();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void VerifytwiterLogoEnableTest() throws Exception
	{
		boolean expecstr = inventry.twiterLogoEnable();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void verifyFacebookLinkTest() throws Exception
	{
		String actustr = "Facebook";
		String expecstr = inventry.Facebooklink();	
		AssertJUnit.assertEquals(actustr, expecstr);		
	}
	@Test (enabled = false)
	public void VerifyFacebookLogoVisibleTest() throws Exception
	{
		boolean expecstr = inventry.facebookLogoVisible();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void VerifyFacebookLogoEnableTest() throws Exception
	{
		boolean expecstr = inventry.facebookLogoEnable();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void verifyLinkedInLinkTest() throws Exception
	{
		String actustr = "LinkedIn";
		String expecstr = inventry.LinkedInlink();	
		AssertJUnit.assertEquals(actustr, expecstr);	
//		System.out.println(inventry.LinkedInlink());
	}
	@Test (enabled = false)
	public void VerifyLinedInLogoVisibleTest() throws Exception
	{
		boolean expecstr = inventry.linkedInLogoVisible();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void VerifyLinkedInLogoEnableTest() throws Exception
	{
		boolean expecstr = inventry.LinkedInLogoEnable();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void VerifySwagRobotImgLogoVisibleTest() throws Exception
	{
		boolean expecstr = inventry.swagRobotImgLogoVisible();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test (enabled = false)
	public void VerifyMenuLogoVisibleTest() throws Exception
	{
		boolean expecstr = inventry.MenuButtonLogoVisible();	
		AssertJUnit.assertEquals(expecstr, true);		
	}
	@Test  (enabled = false)
	public void VerifyMenuButtonLogoEnableTest() throws Exception
	{
		boolean expecstr = inventry.MenuButtonLogoEnable();
		AssertJUnit.assertEquals(expecstr, true);
	}
	@Test (enabled = false)
	public void VerifyMenuButtonLogoClickTest() throws Exception
	{	
		List<String> expecstr = inventry.MenuButtonList();
		List<String> actustr =  inventry.MenuButtonLogoClick();
		AssertJUnit.assertEquals(actustr, expecstr);
	}
	@Test  (enabled = false)
	public void verifyitemsInMenuButtonEnable()
	{
		boolean actuResult = inventry.itemsInMenuButtonEnable();
		AssertJUnit.assertEquals(actuResult, true);
	}  
	@Test  (enabled = false)
	public void verifyCloseMenuButtonDisplayTest()
	{
		boolean menuButton = inventry.closeMenuButtonDisplay();
		Assert.assertEquals(menuButton, true);
	}
	@Test  (enabled = false)
	public void verifyCloseMenuButtonEnableTest()
	{
		boolean menuButton = inventry.closeMenuButtonEnable();
		Assert.assertEquals(menuButton, true);
	}
	@Test  (enabled = false)
	public void verifycloseMenuButtonClickTest()
	{
		boolean menuButton = inventry.closeMenuButtonClick();
		Assert.assertEquals(menuButton, true);
	}
	@Test  (enabled = false)
	public void verifySortContainerButtonDisplayTest()
	{
		boolean filter = (boolean) inventry.sortContainerButtonDisplay();
		AssertJUnit.assertEquals(filter, true);
	}
	@Test  (enabled = false)
	public void verifySortContainerButtonEnableTest()
	{
		 boolean filter = inventry.sortContainerButtonEnable();
		 AssertJUnit.assertEquals(filter, true);
	}
	@Test  (enabled = true)
	public void verifySortContainerDropDownTest() throws Exception
	{
		inventry.sortContainerDropDown();
		Thread.sleep(5000);
	}
	@Test   (enabled = false)
	public void verifysortContainerDropDownGetTest() throws Exception
	{
		System.out.println(inventry.sortContainerDropDownGet());
		Thread.sleep(5000);
	}
	@Test (enabled = false)
	public void verifysortContainerDropDownGet() throws Exception
	{	
		List<String> expecstr = inventry.sortContainerDropDownHand();
		List<String> actustr =  inventry.sortContainerDropDownGet();
		AssertJUnit.assertEquals(actustr, expecstr);
	}
	@Test  (enabled = false)
	public void verifyinventryItemNamegetSwagAppTest()
	{
		List<String> expecstr = inventry.inventryItemNamegetWriteSwagApp();
		List<String> actustr =  inventry.inventryItemNamegetSwagApp();
		AssertJUnit.assertEquals(actustr, expecstr);
		System.out.println(inventry.inventryItemNamegetSwagApp());
	}
	@Test  (enabled = false)
	public void verifyShoppingCartLinkDisplayTest() 
	{
		boolean cartLogo = inventry.shoppingCartLinkDisplay();
		AssertJUnit.assertEquals(cartLogo, true);
	}
	@Test  (enabled = false)
	public void verifyShoppingCartLinkEnableTest() 
	{
		boolean cartLogo = inventry.shoppingCartLinkEnamble();
		AssertJUnit.assertEquals(cartLogo, true);
	}
	@Test  //(enabled = false)
	public void verifyProductCountTest() throws Exception
	{
		String cartCount = inventry.verifyCount();
		Assert.assertEquals(cartCount, "4");
//		System.out.println(inventry.verifyCount());
//		Thread.sleep(5000);
	}
	
	
	@AfterMethod
	public void closeBrow()
	{
		driver.close();
	}
}
