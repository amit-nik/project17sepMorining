package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class checkOutPageTwo extends TestBase {
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UserName;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']" ) private WebElement LoginButton;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartLogo;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkOutButton;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTShirt;
	@FindBy(id = "remove-sauce-labs-fleece-jacket") private WebElement fleeceJacket;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagpack;
	@FindBy(id = "remove-sauce-labs-backpack") private WebElement removePagpack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(id = "remove-sauce-labs-bike-light") private WebElement removeBikeLight;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private WebElement Tshirt;
	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)") private WebElement removeTshirt;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement labOnesie;
	@FindBy(xpath = "//div[@class='header_secondary_container']") private WebElement checkOutPageHeading;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCode;
	@FindBy(xpath = "//button[@id='cancel']") private WebElement cancleButton;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continueButton;
	@FindBy(xpath = "//div[@class='cart_list']//div[@class='cart_item']") private List<WebElement> numOfItems;
	@FindBy(xpath = "//span[text()='Checkout: Overview']") private WebElement checkPagTwoHead;
	@FindBy(xpath = "(//div[@class='summary_info']//div)[1]") private WebElement payInfoHead;
	@FindBy(xpath = "(//div[@class='summary_info']//div)[2]") private WebElement payInfo;
	@FindBy(xpath = "(//div[@class='summary_info']//div)[3]") private WebElement shipInfoHead;
	@FindBy(xpath = "(//div[@class='summary_info']//div)[4]") private WebElement shipInfoaddress;
	@FindBy(xpath = "//div[text()='29.99']") private WebElement inventryItemPri1;
	@FindBy(xpath = "//div[text()='9.99']") private WebElement inventryItemPri2;
	@FindBy(xpath = "//div[text()='15.99']") private WebElement inventryItemPri3;
	@FindBy(xpath = "//div[text()='4.48']") private WebElement summaryTax;
	@FindBy(xpath = "//div[text()='60.45']") private WebElement totalAmount;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishButton;
	@FindBy(xpath = "//div[@class='header_secondary_container']") private WebElement compHeading;
	
	
	
	
	//div[@class='summary_tax_label']

	public checkOutPageTwo()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCheckOutPageTwo() throws Exception
	{
		UserName.sendKeys(ReadData.readPropertyFile("UserName"));
		Password.sendKeys(ReadData.readPropertyFile("Password"));
		LoginButton.click();
		bagpack.click();
		bikeLight.click();
		Tshirt.click();
		cartLogo.click();
		checkOutButton.click();
		firstName.sendKeys(ReadData.readPropertyFile("firstName"));
		lastName.sendKeys(ReadData.readPropertyFile("lastName"));
		postalCode.sendKeys(ReadData.readPropertyFile("postalCode"));
		continueButton.click();
	}
	public String verifyCheckPageTwoUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyCheckPageHeading()
	{
		return checkPagTwoHead.getText();
	}
	public boolean verifyAddItemDisplay0()
	{
		return numOfItems.get(0).isDisplayed();
	}
	public boolean verifyAddItemDisplay1()
	{
		return numOfItems.get(1).isDisplayed();
	}
	public boolean verifyAddItemDisplay2()
	{
		return numOfItems.get(2).isDisplayed();
	}
	public String  verifyPayInfoHead()
	{
		return  payInfoHead.getText();
	}
	public String  verifyPayInfo()
	{
		return  payInfo.getText();
	}
	public String  verifyShipInfoHead()
	{
		return  shipInfoHead.getText();
	}
	public String  verifyShipInfo()
	{
		return  shipInfoaddress.getText();
	}
	public  double verifyTotalAmount()
	{
//		String ssss= inventryItemPri1.getText().replace("$", "");
		String price1= inventryItemPri1.getText().substring(1);
		String price2= inventryItemPri2.getText().substring(1);
		String price3= inventryItemPri3.getText().substring(1);
		String Tax = summaryTax.getText().replace("Tax: $", "");
		double totalPrice = Double.parseDouble(price1)+Double.parseDouble(price2)+Double.parseDouble(price3)+Double.parseDouble(Tax);
		System.out.println(totalPrice);
		return totalPrice;
	}
	public double verifyTotalAmountactu()
	{
		String total = totalAmount.getText().replace("Total: $", "");
		double price = Double.parseDouble(total);
		return price;
	}
	
	
	public String verfyFinishButtonClick()
	{
		finishButton.click();
		return driver.getCurrentUrl();
	}
	public String verifyCompletePageHeading()
	{
		return compHeading.getText();
	}

}
