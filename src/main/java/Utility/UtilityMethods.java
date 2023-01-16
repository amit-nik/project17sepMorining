package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;

public class UtilityMethods extends TestBase {
	
	public static List<String> menuButtonData(List<WebElement> menu)
	{
		List<WebElement> menulistindex = menu;
		List<String> getMenuData = new ArrayList<String>();
		for(WebElement value: menulistindex)
		{
			getMenuData.add(value.getText());
		}
		return getMenuData;
	}
	public static List<String> getMenuButtonData()
	{
		List<String> menuData = new ArrayList<String>();
		menuData.add("ALL ITEMS");
		menuData.add("ABOUT");
		menuData.add("LOGOUT");
		menuData.add("RESET APP STATE");
		return menuData;
	}
	public static boolean itemsInMenuButtonEnable(List<WebElement> menu1)
	{
		List<WebElement> menulistindex = menu1;
		boolean result = false;
		for(WebElement value : menulistindex)
			result = value.isDisplayed();
		return result;
	}
	public static void sortContainerDropDown(WebElement filter, int intgerr) throws Exception
	{
		Select sortFilter = new Select(filter);
		sortFilter.selectByIndex(intgerr);;
	}
	public static List<String> sortContainerDropDownHandsheet()
	{
		List<String> handFilter = new ArrayList();
		handFilter.add("Name (A to Z)");
		handFilter.add("Name (Z to A)");
		handFilter.add("Price (low to high)");
		handFilter.add("Price (high to low)");
		return handFilter;
	}
	public static List<String> sortContainerDropDownGetSoft(List<WebElement> sortcon)
	{
		List<WebElement> filterButtonDrop = sortcon;
		List<String> verifyFilterText = new ArrayList<String>();
		for(WebElement value : filterButtonDrop)
		{
			verifyFilterText.add(value.getText());
		}
		return verifyFilterText;	
	}
	public static List<String> inventryItemNameget(List<WebElement> itemsName)
	{
		List<WebElement> getItemName = itemsName;
		List<String> typeItemName = new ArrayList<String>();
		for(WebElement value :getItemName )
		{
			typeItemName.add(value.getText());
		}
		return typeItemName;		
	}
	public static List<String> inventryItemNamegetWrite()
	{
		List<String> writeName = new ArrayList();
		writeName.add("Sauce Labs Backpack");
		writeName.add("Sauce Labs Bike Light");
		writeName.add("Sauce Labs Bolt T-Shirt");
		writeName.add("Sauce Labs Fleece Jacket");
		writeName.add("Sauce Labs Onesie");
		writeName.add("Test.allTheThings() T-Shirt (Red)");
		return writeName;
	}
	
	public void multipleWindow(String driv)
	{

	}

}
