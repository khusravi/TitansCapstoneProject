package page.objects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy (id = "input-quantity")
	private WebElement quantityInput;

	
	@FindBy (id = "button-cart")
	private WebElement cartButton;

	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageDisplayed;
	
	@FindBy(xpath ="//body/div[@id='product-product']/div[1]/a[1]")
	private WebElement HPLPsuccessmessage;
	
	
	//Third Scenario Canon EOS 5D Elements
	
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEos5dCamera;
	
	public void clickOnCanonEos5dCamera() {
		canonEos5dCamera.click();
	}
	
	@FindBy (xpath = "//select[@class='form-control']")
	private WebElement selectColor; //select color from dropdown

//	@FindBy (xpath = "(//a[text()='Canon EOS 5D Camera'])[3]")
//	private WebElement eos5DSuccessMessage;
	
	public void selectColor() {
		Select select = new Select(selectColor);
		select.selectByVisibleText("Red");
	}

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
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}

	
	public void clickOnAdToCartButton() {
		cartButton.click();
	}
	
	
	public String successMessage() {
		String actualResult = "Success: You have added " + HPLPsuccessmessage.getText() +" to your shopping cart!";
		return actualResult;
	}

//	public String canonEos5DSuccessMessage() {
//		String actualResult = "Success: You have added " + eos5DSuccessMessage.getText() +" to your shopping cart!";
//		return actualResult;
//	}
	public boolean isSuccessMessage() {
		if(successMessageDisplayed.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	/// 4th Scenario
	
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	
	@FindBy (xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	public void clickOnWriteReviewLink() {
		writeReviewLink.click();
	}
	
	@FindBy (id = "input-name")
	private WebElement yourNameInput;
	
	public void enterYourName(String nameValue) {
		yourNameInput.sendKeys(nameValue);
	}
	
	
	@FindBy (id = "input-review")
	private WebElement yourReviewInput;
	
	public void enterYourReview(String reviewValue) {
		yourReviewInput.sendKeys(reviewValue);
	}
	
	@FindBy (xpath = "//input[@type='radio']")
	private List<WebElement> rating;
	
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for (WebElement element : ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
	
		}
	}
	
	@FindBy (id = "button-review")
	private WebElement reviewContinueButton;
	
	public void clickOnReviewContinueButton() {
		reviewContinueButton.click();
	}
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private String reviewSubmissionMessage;
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}
	
	
}
