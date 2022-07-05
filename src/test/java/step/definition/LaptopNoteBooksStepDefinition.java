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
	}
	
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapNotePage.clickOnShowAllLaptopsNotebookOption();
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		lapNotePage.clickOnMacbook();
	}
	
	@Then("item should be Added and cart should show {string}")
	public void item_should_be_Added_and_cart_should_show(String expectedCartValue) {
		Assert.assertEquals(lapNotePage.isItemAddedToCart(), expectedCartValue);
		WebDriverUtility.hardWait();
	}
	
//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String string) {
//		WebDriverUtility.hardWait();
//		Assert.assertEquals(desktopPage.successMessage(),string);
//		//Assert.assertTrue(desktopPage.isSuccessMessage());
//		logger.info(string + " equals to "+desktopPage.successMessage() );
//		WebDriverUtility.takeScreenShot();
//		WebDriverUtility.hardWait();
//
//	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapNotePage.clickOnCartTotalButton();
	}
	
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapNotePage.clickOnXButton();
		WebDriverUtility.hardWait();
	}
	
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		WebDriverUtility.hardWait();
		Assert.assertEquals(lapNotePage.isItemRemovedFromCart(), string);
	}

}
