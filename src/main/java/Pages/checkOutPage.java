package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Utility.ReadData;

public class checkOutPage extends TestBase{
	
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
	
	//button[@id='cancel']
	public checkOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void goesToCheckOutPage() throws Exception
	{
		UserName.sendKeys(ReadData.readPropertyFile("UserName"));
		Password.sendKeys(ReadData.readPropertyFile("Password"));
		LoginButton.click();
		bagpack.click();
		bikeLight.click();
		Tshirt.click();
		cartLogo.click();
		checkOutButton.click();
	}
	public String verifyCheckOutPageTitle()
	{
		return driver.getTitle();
	}
	public String verifyCheckOutPageUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyCheckOutPageHeading()
	{ 
		 String heading = checkOutPageHeading.getText();
		 return heading;
	}
	public String verifyAddressDetailsPass() throws Exception
	{
		firstName.sendKeys(ReadData.readPropertyFile("firstName"));
		lastName.sendKeys(ReadData.readPropertyFile("lastName"));
		postalCode.sendKeys(ReadData.readPropertyFile("postalCode"));
		continueButton.click();
		return driver.getCurrentUrl();
	}
	
}
