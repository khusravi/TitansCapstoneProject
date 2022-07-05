package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
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

	
	@Then("User should see a message {string}") //Item added to cart successfully 
	public void user_should_see_a_message(String string) {
		WebDriverUtility.hardWait();
		Assert.assertEquals(desktopPage.successMessage(),string);
		Assert.assertTrue(desktopPage.isSuccessMessage());
		logger.info(string + " equals to " + desktopPage.successMessage() );
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();

	}

	//Third Scenario CanonEos 5D
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEos5dCamera();
		WebDriverUtility.hardWait();
	}
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.selectColor();
		logger.info("User select color from dropdown 'Red'");
		WebDriverUtility.hardWait();
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		Assert.assertTrue(desktopPage.isSuccessMessage());
		logger.info("User see Succes: you have added Canon EOS 5D to your shopping cart!");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	//4th Scenario
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEOS5DCamera();
		logger.info("User clicked on Canon EOS 5D item");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnWriteReviewLink();
		logger.info("User clicked on write a review link");
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
	desktopPage.enterYourName(reviewInformation.get(0).get("yourname"));
	desktopPage.enterYourReview(reviewInformation.get(0).get("yourReview"));
	desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
	logger.info("user filled the review Information");
	WebDriverUtility.hardWait();
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickOnReviewContinueButton();
		logger.info("User clicked on Continue Button");
	}
	
	//varify with assertTrue method.
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		System.out.println(desktopPage.reviewText() + " from println");
		logger.info("success message availibility varified ");
	}



}

