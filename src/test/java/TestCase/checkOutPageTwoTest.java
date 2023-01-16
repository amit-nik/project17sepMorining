package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.checkOutPageTwo;

public class checkOutPageTwoTest extends TestBase {
	
	checkOutPageTwo checkPageTwo;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		checkPageTwo = new checkOutPageTwo();
		checkPageTwo.verifyCheckOutPageTwo();
	}
	
	@Test (enabled = false)
	public void verifyCheckPageTwoUrlTest()
	{
		String expecStr = "https://www.saucedemo.com/checkout-step-two.html";
		String acuStr = checkPageTwo.verifyCheckPageTwoUrl();
		Assert.assertEquals(acuStr, expecStr);
	}
	@Test  (enabled = false)
	public void verifyCheckPageHeadingTest()
	{
		String expecStr = "CHECKOUT: OVERVIEW";
		String acuStr = checkPageTwo.verifyCheckPageHeading();
		Assert.assertEquals(acuStr, expecStr);
	}
	@Test  (enabled = false)
	public void verifyAddItemDisplayTest()
	{
		boolean acuStr = checkPageTwo.verifyAddItemDisplay0();
		Assert.assertEquals(acuStr, true);
		boolean acuStr1 = checkPageTwo.verifyAddItemDisplay1();
		Assert.assertEquals(acuStr1, true);
		boolean acuStr2 = checkPageTwo.verifyAddItemDisplay2();
		Assert.assertEquals(acuStr2, true);
	}
	@Test  (enabled = false)
	public void verifyPayInfoHeadTest()
	{
		String expecStr = "Payment Information:";
		String acuStr = checkPageTwo.verifyPayInfoHead();
		Assert.assertEquals(acuStr, expecStr);
	}
	@Test  (enabled = false)
	public void verifyPayInfoTest()
	{
		String expecStr = "SauceCard #31337";
		String acuStr = checkPageTwo.verifyPayInfo();
		Assert.assertEquals(acuStr, expecStr);
//		System.out.println(acuStr);
	}
	@Test (enabled = false)
	public void verifyShipInfoHeadTest()
	{
		String expecStr = "Shipping Information:";
		String acuStr = checkPageTwo.verifyShipInfoHead();
		Assert.assertEquals(acuStr, expecStr);
//		System.out.println(acuStr);
	}
	@Test  (enabled = false)
	public void verifyShipInfoTest()
	{
		String expecStr = "FREE PONY EXPRESS DELIVERY!";
		String acuStr = checkPageTwo.verifyShipInfo();
		Assert.assertEquals(acuStr, expecStr);
//		System.out.println(acuStr);
	}
	@Test //   (enabled = false)
	public void verifyTotalAmountTest()
	{

//System.out.println(checkPageTwo.verifyTotalAmount());
	double totalPrice = checkPageTwo.verifyTotalAmount();
	double price = checkPageTwo.verifyTotalAmountactu();
	Assert.assertEquals(totalPrice, price);
	}
	@Test  (enabled = false)
	public void verfyFinishButtonClickTest()
	{
		String expecStr = "https://www.saucedemo.com/checkout-complete.html";
		String actuStr = checkPageTwo.verfyFinishButtonClick();
		Assert.assertEquals(actuStr, expecStr);
	}
	@Test  (enabled = false)
	public void verifyCompletePageHeadingTest()
	{
		String expecStr = "CHECKOUT: OVERVIEW";
		String actuStr = checkPageTwo.verifyCompletePageHeading();
		Assert.assertEquals(actuStr, expecStr);
		System.out.println(actuStr);
		Reporter.log(actuStr);
	}

	
	@AfterMethod
	public void closeBraw()
	{
		driver.close();
	}
}
