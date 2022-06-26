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
	
	//Background:
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
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
		List<WebElement> desktopsItemsElement = desktopPage.desktopsItems();
		for(WebElement elements : desktopsItemsElement) {
			Assert.assertTrue(elements.isDisplayed());
			logger.info(elements.getAttribute("title") + " is present");
			
		}
		WebDriverUtility.hardWait();
		WebDriverUtility.takeScreenShot();
	}

}
