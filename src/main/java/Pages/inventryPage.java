package Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethods;

public class inventryPage extends TestBase {

	@FindBy(xpath = "//input[@id='user-name']") private WebElement UserName;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']" ) private WebElement LoginButton;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//span[@class='title']") private WebElement ProTageName;
	@FindBy(xpath = "//div[@class='peek']") private WebElement PeekLogo;
	@FindBy(xpath = "(//a[@target='_blank'])[1]") private WebElement twiter;
	@FindBy(xpath = "(//a[@target='_blank'])[2]") private WebElement Facebook;
	@FindBy(xpath = "(//a[@target='_blank'])[3]") private WebElement LinkdIn;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement swagRobotImg;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement MenuButton;
	@FindBy(xpath = "//nav[@class='bm-item-list']//a") private List<WebElement> menuList;
	@FindBy(xpath = "//button[text()='Close Menu']") private WebElement menuButtonClose;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortContainerButton;
	@FindBy(xpath = "//select[@class='product_sort_container']//option") private List<WebElement> listOfContainer;
	@FindBy(xpath = "//div[@class='inventory_item_name']") private List<WebElement> inventryItemName;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartLink;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTShirt;
	@FindBy(id = "remove-sauce-labs-fleece-jacket") private WebElement fleeceJacket;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagpack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private WebElement Tshirt;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement labOnesie;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement proCount;
	
	//span[@class='shopping_cart_badge']
	public inventryPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void swagLogin() throws Exception
	{
		UserName.sendKeys(ReadData.readPropertyFile("UserName"));
		Password.sendKeys(ReadData.readPropertyFile("Password"));
		LoginButton.click();
	}
	public String InventryPageUrl() throws Exception
	{
		return driver.getCurrentUrl();
	}
	public boolean inventryAppLogo() throws Exception
	{
		return appLogo.isDisplayed();
	}
	public String inventryTagNametext() throws Exception
	{
		return ProTageName.getText();
	}
	public boolean peekLogo() throws Exception
	{
		return PeekLogo.isDisplayed();
	}
	public String twiterlink() throws Exception
	{
		return twiter.getText();
	}
	public boolean twiterLogoVisible() throws Exception
	{
		return twiter.isDisplayed();
	}
	public boolean twiterLogoEnable() throws Exception
	{
		return twiter.isEnabled();
	}
	public String Facebooklink() throws Exception
	{
		return Facebook.getText();
	}
	public boolean facebookLogoVisible() throws Exception
	{
		return Facebook.isDisplayed();
	}
	public boolean facebookLogoEnable() throws Exception
	{
		return Facebook.isEnabled();
	}
	public String LinkedInlink() throws Exception
	{
		return LinkdIn.getText();
	}
	public boolean linkedInLogoVisible() throws Exception
	{
		return LinkdIn.isDisplayed();
	}
	public boolean LinkedInLogoEnable() throws Exception
	{
		return LinkdIn.isEnabled();
	}
	public boolean swagRobotImgLogoVisible() throws Exception
	{
		return swagRobotImg.isDisplayed();
	}
	public boolean MenuButtonLogoVisible() throws Exception
	{
		return MenuButton.isDisplayed();
	}
	public boolean MenuButtonLogoEnable() throws Exception
	{
		return MenuButton.isEnabled();
	}
	public List<String> MenuButtonLogoClick() throws Exception
	{
		MenuButton.click();
		List<String> getmenuvalue = UtilityMethods.menuButtonData(menuList);
		return getmenuvalue;
	}
	public List<String> MenuButtonList()
	{
		List<String> inhandGetMenu = UtilityMethods.getMenuButtonData();
		return inhandGetMenu;
	}
	public boolean itemsInMenuButtonEnable()
	{
		MenuButton.click();
		return UtilityMethods.itemsInMenuButtonEnable(menuList);
	}
	public boolean closeMenuButtonDisplay()
	{
		MenuButton.click();
		return menuButtonClose.isDisplayed();
	}
	public boolean closeMenuButtonEnable()
	{
		MenuButton.click();
		return menuButtonClose.isEnabled();
	}
	public boolean closeMenuButtonClick()
	{
		MenuButton.click();
		menuButtonClose.click();
		return false;
	}
	public boolean sortContainerButtonDisplay()
	{
		return sortContainerButton.isDisplayed();
	}
	public boolean sortContainerButtonEnable()
	{
		return sortContainerButton.isEnabled();
	}
	public void sortContainerDropDown() throws Exception
	{
		sortContainerButton.click();
		UtilityMethods.sortContainerDropDown(sortContainerButton, 1);
	}
	public List<String> sortContainerDropDownGet() throws Exception
	{
		sortContainerButton.click();
		return UtilityMethods.sortContainerDropDownGetSoft(listOfContainer);
	}
	public List<String> sortContainerDropDownHand()
	{
		return UtilityMethods.sortContainerDropDownHandsheet();
	}
	public List<String> inventryItemNamegetSwagApp()
	{
		return UtilityMethods.inventryItemNameget(inventryItemName);
	}
	public List<String> inventryItemNamegetWriteSwagApp()
	{
		return UtilityMethods.inventryItemNamegetWrite();
	}
	public boolean shoppingCartLinkDisplay()
	{
		return cartLink.isDisplayed();
	}
	public boolean shoppingCartLinkEnamble()
	{
		return cartLink.isEnabled();
	}
	public String verifyCount() throws Exception
	{ 
		Thread.sleep(5000);
		boltTShirt.click();
		Thread.sleep(2000);
		bagpack.click();
		Thread.sleep(2000);
		bikeLight.click();
		Thread.sleep(2000);
		Tshirt.click();
		Thread.sleep(2000);
//		boltTShirt.click();
//		fleeceJacket.click(); 
//		Thread.sleep(5000);
		return proCount.getText();
	}

}
