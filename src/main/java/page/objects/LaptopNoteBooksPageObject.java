package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebookTab;
	
	public void clickONlaptopsNotebookTab() {
		WebDriverUtility.mouseHoverOnElemnt(laptopsNotebookTab);
	}
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebookOption;
	
	public void clickOnShowAllLaptopsNotebookOption() {
		showAllLaptopsNotebookOption.click();
	}
	
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macbook;
	
	public void clickOnMacbook() {
		macbook.click();
	}
	
	@FindBy (css = "#cart-total")
	private WebElement cartTotal;
	
	//this method varifies the cart value
	public String isItemAddedToCart() {
		String actualResult = cartTotal.getText();
		return actualResult;
	}
	
	public String isItemRemovedFromCart() {
		String actualResult = cartTotal.getText();
		return actualResult;
	}
	//click on carttotla to open the cart detail
	public void clickOnCartTotalButton() {
		cartTotal.click();
	}
	//X button removes item from the cart
	@FindBy (xpath = "//button[@class='btn btn-danger btn-xs']")
	private WebElement xButton;
	
	public void clickOnXButton() {
		xButton.click();
	}
	
	
	//Scenario: Product Comparison
	
	@FindBy (xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement macbookComparisonIcon;
	
	public void clickOnMacbookComparisonIcon() {
		macbookComparisonIcon.click();
	}
	
	@FindBy (xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement macbookAirComparisonIcon;
	
	@FindBy (id = "compare-total")
	private WebElement productCompare;
	
	public void clickOnProductCompareLink() {
		productCompare.click();
	}
	
	@FindBy (xpath = "//table[@class='table table-bordered']")
	private WebElement productComparison;
	
	
	//FIXME
	public void isProductComparisonChartPresent() {
		productComparison.isDisplayed();
	}
	
	//Scenario: Adding an item to Wish list
	
	@FindBy (xpath = "(//button[@data-original-title='Add to Wish List'])[5]")
	private WebElement sonyVaioAddToWishListIcon;
	
	public void clickOnSonyVaioAddToWishListIcon() {
		sonyVaioAddToWishListIcon.click();
	}

	//Warining Maybe duplicate//////////////////////////////////////////////////////
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement loginRequiredMessage;
	
	public boolean loginRequiredMessagePresent() {
		if(loginRequiredMessage.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	//Scenario: Validate the price of MacBook Pro is '2000'
	
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macbookPro;
	
	public void clickOnMacbookPro() {
		macbookPro.click();
	}
	
	
	@FindBy (xpath = "//h2[text()='$2,000.00']")
	private WebElement macbookProPriceTag;
	
	public void isMacbookProPriceTagPresent(){ 		//FIXME
		macbookProPriceTag.isDisplayed();
		}
}
