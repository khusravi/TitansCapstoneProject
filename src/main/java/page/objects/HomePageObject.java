package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currencyOption;
	
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement euroOption;
	
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement euroSign;
	
	@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCart;
	
	@FindBy (xpath = "//p[@class='text-center']")
	private WebElement emptyCartTextCenter;
	
	//Methods
	public void clickOnCurrencyOption() {
		currencyOption.click();
	}
	
	public void clickOnEuroOption() {
		euroOption.click();
	}
	
	public boolean isCurrencyChangedToEuro() {
		if(euroSign.isDisplayed()) {
			return true;
		}else
			return false;
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public boolean isCartEmptyMessageDisplayed() {
		if(emptyCartTextCenter.isDisplayed()) {
			return true;
		}else
			return false;
	}

}
