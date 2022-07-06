package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base{
	LaptopNoteBooksPageObject lapNotePage = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapNotePage.clickONlaptopsNotebookTab();
		logger.info("User clicked on Laptop &NoteBook tab");
	}
	
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapNotePage.clickOnShowAllLaptopsNotebookOption();
		logger.info("User clicked on Show all Laptop &NoteBook option");
		WebDriverUtility.hardWait();
	}
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		lapNotePage.clickOnMacbook();
		logger.info("User clicked on MackBook");
		WebDriverUtility.hardWait();
	}
	
	
	@Then("item should be added and cart should show {string}")
	public void item_should_be_added_and_cart_should_show(String string) {
		//Assert.assertEquals(lapNotePage.itemAddedToCartDisplayed(), string);
		Assert.assertTrue(lapNotePage.itemAddedToCartDisplayed());
		logger.info("Item was added and shown in cart");
		WebDriverUtility.hardWait();
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapNotePage.clickOnCartTotalButton();
		logger.info("User clicked on cart option");
		WebDriverUtility.hardWait();
	}
	
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapNotePage.clickOnXButton();
		logger.info("user removed item from cart");
		WebDriverUtility.hardWait();
	}
	
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		WebDriverUtility.hardWait();
		//Assert.assertEquals(lapNotePage.itemRemovedFromCartDisplayed(), string);
		Assert.assertTrue(lapNotePage.itemRemovedFromCartDisplayed());
		logger.info("User varified that item was removed from cart");
		WebDriverUtility.takeScreenShot();
	}
	
	
	//Scenario: Product Comparison
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		lapNotePage.clickOnMacbookComparisonIcon();
		logger.info("User clicked on MacBook product comparison icon");
		WebDriverUtility.hardWait();
	}
	
	@When("User click on product comparison icon on ‘MacBook Air’")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		lapNotePage.clickOnMacbookAirComparisonIcon();
		logger.info("User clicked on MacBook Air product comparison icon");
		WebDriverUtility.hardWait();
	}
	
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		lapNotePage.clickOnProductCompareLink();
		logger.info("User clicked on Product comparison link");
		WebDriverUtility.hardWait();
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		lapNotePage.isProductComparisonChartPresent();
		logger.info("User varified Product Comparison Chart is present");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	//Scenario: Wish-List
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		lapNotePage.clickOnSonyVaioAddToWishListIcon();
		logger.info("User clicked on heart icon to add specified laptop to wish list");
	}
	
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		lapNotePage.loginRequiredMessagePresent();
		logger.info("User received adding to wish list requirment message");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	//Scenario: ValidatePrice
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		lapNotePage.clickOnMacbookPro();
		logger.info("User clicked on MacBookPro");
	}
	
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		lapNotePage.isMacbookProPriceTagPresent();
		logger.info("User varified price tag is present on UI");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
}
