package Pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class cartPage extends TestBase{

	@FindBy(xpath = "//input[@id='user-name']") private WebElement UserName;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']" ) private WebElement LoginButton;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartLogo;
	@FindBy(xpath = "//span[text()='Your Cart']") private WebElement cartPageHeading;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement cartQtyLabel;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement cartDscLabel;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTShirt;
	@FindBy(id = "remove-sauce-labs-fleece-jacket") private WebElement fleeceJacket;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagpack;
	@FindBy(id = "remove-sauce-labs-backpack") private WebElement removePagpack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(id = "remove-sauce-labs-bike-light") private WebElement removeBikeLight;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private WebElement Tshirt;
	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)") private WebElement removeTshirt;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement labOnesie;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement proCount;
	@FindBy(xpath = "//div[@class='cart_list']//div[@class='cart_item']") private List<WebElement> numOfItems;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkOutButton;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement contiShopButton;



	//button[@id='continue-shopping']
	public cartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void logCartPage() throws Exception 
	{
		UserName.sendKeys(ReadData.readPropertyFile("UserName"));
		Password.sendKeys(ReadData.readPropertyFile("Password"));
		LoginButton.click();
	}
	//	To Verify Cart Page Link
	public String verifyCartLink()
	{
		cartLogo.click();
		return driver.getCurrentUrl();
	}
	//	To Verify Cart Page title
	public String VerifyCartPageTitle()
	{
		cartLogo.click();
		String title = driver.getTitle();
		return title;
	}
	//	To Verify Display Cart Page Heading
	public boolean VerifyCartPageHeadingDisplay()
	{
		cartLogo.click();
		return cartPageHeading.isDisplayed();
	}
	//	To Verify Cart Page Heading
	public String VerifyCartPageHeading()
	{
		cartLogo.click();
		String cartPageName = cartPageHeading.getText();
		return cartPageName;
	}
	//	TO Verify Cart Quantity ColumName Display
	public boolean verifyCartQtyLabelDisplay()
	{
		cartLogo.click();
		return cartQtyLabel.isDisplayed();
	}
	//	To Verify Cart Quantity Colum Heading
	public String verifyQtyColumLabel()
	{
		cartLogo.click();
		return cartQtyLabel.getText();
	}
	//	To Verify Cart Desc Colum Heading Display
	public boolean verifyDescColumHeadingDisplay()
	{
		cartLogo.click();
		boolean discription =  cartDscLabel.isDisplayed();
		return discription;
	}
	//	To Verify Cart Desc Colum Heading
	public String verifyCartDescColumLabel()
	{
		cartLogo.click();
		String descLabel = cartDscLabel.getText();
		return descLabel;
	}
	//	To Verify The Total Number Of Item Add In The Cart
	//	This Shown In Cart Logo.
	public int verifyNumOfItemAdd()
	{
		bagpack.click();
		Tshirt.click();
		bikeLight.click();
		cartLogo.click();
		numOfItems.size();
		int count = 0;
		if(numOfItems.size()==3)
			count = numOfItems.size();
		return count;
	}
	public String verifyshownCartNumber()
	{
		return proCount.getText();
	}
	//	To Verify The Total Number Of Item Add In The Cart
	//	This Shown In Cart Logo. If Cart Page One Is remove
	//	This Count Is Correct Visible
	public int verifyInCartPageOneItemRemove() throws Exception
	{
		bagpack.click();
		Tshirt.click();
		bikeLight.click();
		cartLogo.click();
		Thread.sleep(2000);
		removeTshirt.click();
		Thread.sleep(2000);
		numOfItems.size();
		int count = 0;
		while(numOfItems.size()==2)
			count = numOfItems.size();
		return count;
	}
	public boolean verifycontinueButtonDisplay()
	{
		cartLogo.click();
		return contiShopButton.isDisplayed();
	}
	public boolean verifycontinueButtonEnable()
	{
		cartLogo.click();
		return contiShopButton.isEnabled();
	}
	public boolean verifyCkechOutButtonDisplay()
	{
		cartLogo.click();
		return checkOutButton.isDisplayed();
	}
	public boolean verifyCkechOutButtonEnable()
	{
		cartLogo.click();
		return checkOutButton.isEnabled();
	}
	public void verifyContinueShopButtonClick() throws Exception
	{
		cartLogo.click();
		Thread.sleep(2000);
		contiShopButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	public void verifyCheckOutButtonClick() throws Exception
	{
		bagpack.click();
		Tshirt.click();
		bikeLight.click();
		cartLogo.click();
		Thread.sleep(2000);
		checkOutButton.click();
		Thread.sleep(2000);
	}



}
