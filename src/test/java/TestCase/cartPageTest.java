package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.cartPage;

public class cartPageTest extends TestBase{

	cartPage cart;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		cart = new cartPage();
		cart.logCartPage();		
	}
	
	@Test (enabled = false) //	To Verify Cart Page Link
	public void verifyCartLinkTest()
	{
		String expeStr = "https://www.saucedemo.com/cart.html";
		String actStr = cart.verifyCartLink();
		Assert.assertEquals(actStr, expeStr);
		System.out.println(cart.verifyCartLink());
	}
	@Test (enabled = false)  //	To Verify Cart Page title
	public void verifyCartPageTitleTest()
	{
		String expeStr = "Swag Labs";
		String actuStr = cart.VerifyCartPageTitle();
		Assert.assertEquals(actuStr, expeStr);
		System.out.println(cart.VerifyCartPageTitle());
	}
	@Test (enabled = false)  //	To Verify Cart Page Heading
	public void VerifyCartPageHeadingTest()
	{
		String expeStr = "YOUR CART";
		String actuStr = cart.VerifyCartPageHeading();
		Assert.assertEquals(actuStr, expeStr);
		System.out.println(cart.VerifyCartPageHeading());
	}
	@Test  (enabled = false)  //	To Verify Display Cart Page Heading
	public void VerifyCartPageHeadingDisplayTest() 
	{
		boolean acturesult = cart.VerifyCartPageHeadingDisplay();
		Assert.assertEquals(acturesult, true);
	} 
	@Test   (enabled = false)  //	TO Verify Cart Quantity ColumName Display
	public void verifyCartQtyLabelDisplayTest()
	{
		boolean acturesult = cart.verifyCartQtyLabelDisplay();
		Assert.assertEquals(acturesult, true);
	}
	@Test   (enabled = false)  //	To Verify Cart Quantity Colum Heading
	public void verifyQtyColumLabelTest()
	{
		String expeStr = "QTY";
		String actuStr = cart.verifyQtyColumLabel();
		Assert.assertEquals(actuStr, expeStr);
		System.out.println(cart.verifyQtyColumLabel());
	}
	@Test (enabled = false)  //	To Verify Cart Desc Colum Heading Display
	public void verifyDescColumHeadingDisplayTest()
	{
		boolean acturesult = cart.verifyDescColumHeadingDisplay();
		Assert.assertEquals(acturesult, true);
	}
	@Test (enabled = false)  //	To Verify Cart Desc Colum Heading
	public void verifyCartDescColumLabelTest()
	{
		String expeStr = "DESCRIPTION";
		String actuStr = cart.verifyCartDescColumLabel();
		Assert.assertEquals(actuStr, expeStr);
		System.out.println(cart.verifyCartDescColumLabel());
	}

//	To Verify The Total Number Of Item Add In The Cart
//	This Shown In Cart Logo.
	@Test  (enabled = false)
	public void verifyNumOfItemAddTest()
	{
		int actuStr = cart.verifyNumOfItemAdd();
		int expeStr = Integer.parseInt(cart.verifyshownCartNumber());
		Assert.assertEquals(actuStr, expeStr);
	}
	@Test //(enabled = false)
	public void verifyInCartPageOneItemRemoveTest() throws Exception
	{
		int actuStr = cart.verifyInCartPageOneItemRemove();
		int expeStr = Integer.parseInt(cart.verifyshownCartNumber());
		Assert.assertEquals(actuStr, expeStr);
	}
	@Test  (enabled = false)
	public void verifycontinueButtonDisplayTest()
	{
		boolean actuResult = cart.verifycontinueButtonDisplay();
		Assert.assertEquals(actuResult, true);
	}
	@Test   (enabled = false)
	public void verifycontinueButtonEnableTest()
	{
		boolean actuResult = cart.verifycontinueButtonEnable();
		Assert.assertEquals(actuResult, true);
	}
	@Test  (enabled = false)
	public void verifyCkechOutButtonDisplayTest()
	{
		boolean actuResult = cart.verifyCkechOutButtonDisplay();
		Assert.assertEquals(actuResult, true);
	}
	@Test  (enabled = false)
	public void verifyCkechOutButtonEnableTest()
	{
		boolean actuResult = cart.verifyCkechOutButtonEnable();
		Assert.assertEquals(actuResult, true);
	}
	@Test  (enabled = false)
	public void verifyContinueShopButtonTest() throws Exception
	{
		cart.verifyContinueShopButtonClick();
	}
	@Test  (enabled = false)
	public void verifyCheckOutButtonClickTest() throws Exception
	{
		cart.verifyCheckOutButtonClick();
	}
	
	
	@AfterMethod
	public void closeBrow()
	{
		driver.close();
	}
}
