package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base{
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy (xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsOption;
	
	@FindBy (tagName = "img")
	private List<WebElement> items;
	
	public void clickOnDesktopsTab() {
		WebDriverUtility.mouseHoverOnElemnt(desktopsTab);
	}
	public void clickOnShowAllDesktops() {
		showAllDesktopsOption.click();
	}
	
	public List<WebElement> desktopsItems(){
		List<WebElement> desktopItems = items;
		return desktopItems;
	}

}
