package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	
	//Scenario: User verify currency values change
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrencyOption();
		logger.info("User clicked on Currency menu");
	}
	
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuroOption();
		logger.info("User Chose Euro from dropdown");
		WebDriverUtility.hardWait();
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePage.isCurrencyChangedToEuro());
		logger.info("currency value changed to Euro");
		WebDriverUtility.takeScreenShot();
	}
	
	
	//Scenario: User empty Shopping cart message displays
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCart();
		logger.info("User clicked on shopping cart");
		WebDriverUtility.hardWait();
	}
	
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(homePage.isCartEmptyMessageDisplayed());
		logger.info("Shopping cart empty message displayed");
		WebDriverUtility.takeScreenShot();
	}


}
