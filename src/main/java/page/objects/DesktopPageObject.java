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
	
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement HPLP3065;
	
	
//	@FindBy(id ="input-quantity")
//	private WebElement quantityInput
	@FindBy (id = "input-quantity")
	private WebElement quantityInput;

	
	@FindBy (id = "button-cart")
	private WebElement cartButton;

	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
//	@FindBy(xpath ="(//a[text()='HP LP3065'])[3]")
//	private WebElement HPLPsuccessmessage;
	

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
	
	//second scenario methods
	public void clickOnHpLp3065() {
		HPLP3065.click();
	}
	
//	public void enterQuantity(String quantityValue) {
//		quantityInput.clear();
//		quantityInput.sendKeys(quantityValue);
//	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}

	
	public void clickOnAdToCartButton() {
		cartButton.click();
	}
	
	
//	public String successMessage() {
//		String actualResult = "Success: You have added " + HPLPsuccessmessage.getText() +" to your shopping cart!";
//		return actualResult;
//	}

	public boolean isSuccessMessage() {
		if(successMessage.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}

}
