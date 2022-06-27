package step.definition;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {
	

	DesktopPageObject desktopPage = new DesktopPageObject();
	
	//Background/first Scenario:
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		WebDriverUtility.hardWait();
		desktopPage.clickOnDesktopsTab();
		logger.info("User moved cursor on Desktops tab");
		WebDriverUtility.hardWait();

	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("User clicked on Show all desktops option");
		WebDriverUtility.hardWait();
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		WebDriverUtility.hardWait();
		List<WebElement> desktopsItemsElement = desktopPage.desktopsItems();
		for(WebElement elements : desktopsItemsElement) {
			Assert.assertTrue(elements.isDisplayed());
			logger.info(elements.getAttribute("title") + " is present");
			
		}
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();
	}
	
	//Second Scenario: add HP LP 3065
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.clickOnHpLp3065();
		logger.info("User clicked on ADD TO CART option on HP LP3065 item");
		WebDriverUtility.hardWait();
	}
	
//	@When("User select quantity {String}")
//	public void user_select_quantity(String quantity) {
//	desktopPage.enterQuantity(quantity);
//	logger.info("User selected quantity" + quantity);
//	WebDriverUtility.hardWait();
//	}
	
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity " +string);
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAdToCartButton();
		WebDriverUtility.hardWait();
	}

	
//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String string) {
//		WebDriverUtility.hardWait();
//		Assert.assertEquals(desktopPage.successMessage(),string);
//		Assert.assertTrue(desktopPage.isSuccessMessage());
//		logger.info(string + " equals to "+desktopPage.successMessage() );
//		WebDriverUtility.takeScreenShot();
//		WebDriverUtility.hardWait();
//
//	}
	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(desktopPage.isSuccessMessage());
		logger.info("User verified seeing success message ");
		WebDriverUtility.takeScreenShot();
	}

	


}

