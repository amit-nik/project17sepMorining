package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.checkOutPage;

public class checkOutPageTest extends TestBase{
	
	checkOutPage checkout;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		checkout = new checkOutPage();
		checkout.goesToCheckOutPage();
	}
	
	@Test (enabled = false)
	public void verifyCheckOutPageTitleTest()
	{
		String expecstr = "Swag Labs";
		String actustr = checkout.verifyCheckOutPageTitle();
		System.out.println(checkout.verifyCheckOutPageTitle());
	}
	@Test  (enabled = false)
	public void verifyCheckOutPageUrlTest()
	{
		String expecstr = "https://www.saucedemo.com/checkout-step-one.html";
		String actustr = checkout.verifyCheckOutPageUrl();
		Assert.assertEquals(actustr, expecstr);
		System.out.println(actustr);
	}
	@Test  //(enabled = false)
	public void verifyCheckOutPageHeadingTest()
	{
		String expecstr = "CHECKOUT: YOUR INFORMATION";
		String actustr = checkout.verifyCheckOutPageHeading();
		Assert.assertEquals(actustr, expecstr);
	}
	@Test
	public void verifyOpenCheckOutTwoPagw() throws Exception
	{
		String expecstr = "https://www.saucedemo.com/checkout-step-two.html";
		String actustr = checkout.verifyAddressDetailsPass();
		Assert.assertEquals(actustr, expecstr);
//		Sys tem.out.println(checkout.verifyAddressDetailsPass());
	}

	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
