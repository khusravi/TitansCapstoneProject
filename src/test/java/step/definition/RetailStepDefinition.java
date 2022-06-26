package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base{
	RetailPageObject retailPage = new RetailPageObject();
	
	//syntax @Tag("exact words of step from scenario")
	//		public void nameofMethod(){  }
	//BackGround codes
	@Given ("User is on Retail website")
	public void User_is_on_Retail_website() {
		Assert.assertTrue(retailPage.isTestEnvironmentTitlePresent());
//		Assert.assertEquals("TEK SCHOOL", retailPage.getTitle());
		logger.info("User is on Retail website");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();	
	}
	
	@And ("User click on MyAccount")
	public void User_click_on_MyAccount() {
		retailPage.clickOnMyAccount();
		logger.info("User click on MyAccount");
		WebDriverUtility.hardWait();
	}
	
	@When ("User click on Login")
	public void User_click_on_Login() {
		retailPage.clickOnLoginOption();
		logger.info("User click on Login");
	}
	@And ("User enter username {string} and password {string}")
	public void User_enter_username_and_password(String email, String password) {
		retailPage.enterEmailAndPassword(email, password);
		logger.info("user enter username " + email + " and " + " password " + password);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And ("User click on Login button")
	public void User_click_on_Login_button() {
		retailPage.clickOnLoginButton();
		logger.info("User click on Login button");
	}
	
	@Then ("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_MyAccount_dashboard() {
		Assert.assertTrue(retailPage.isMyAccountTitlePresent());
		logger.info("User should be logged in to MyAccount dashboard");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	
	//////////////////////////////////////////////////
	//Register Scenario
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnAffiliateRegisterLink();
		logger.info("User click on ‘Register for an Affiliate Account’ link");
	    // Write code here that turns the phrase above into concrete actions
		WebDriverUtility.hardWait();
	}
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	  
		List<Map<String, String>> affiliateForm = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyInput(affiliateForm.get(0).get("company"));
		WebDriverUtility.hardWait();
		retailPage.enterWebsiteInput(affiliateForm.get(0).get("website"));
		WebDriverUtility.hardWait();
		retailPage.enterTaxInput(affiliateForm.get(0).get("taxID"));
		WebDriverUtility.hardWait();
		retailPage.selectpaymentMethod(affiliateForm.get(0).get("paymentMethod"));
		WebDriverUtility.hardWait();
		retailPage.enterChequePayeeName(affiliateForm.get(0).get("chequePayeeName"));
		logger.info("user filled affiliate form");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickOnAboutUsCheckBox();
		logger.info("User check on About us check box");
		WebDriverUtility.hardWait();
	}
	
	@And("User click on Continue button")
	public void User_click_on_continue_button() {
		retailPage.clickOnContinueButton();
		logger.info("User click on Continue button");
		WebDriverUtility.hardWait();
	}
	
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	Assert.assertTrue(retailPage.isSuccessMessagePresent());
	logger.info("success message is present");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}
//	public boolean user_should_see_a_success_message() {
//	    if(retailPage.isSuccessMessagePresent()) {
//	    	return true;
//	    }else {
//	    	return false;
//	    }
//	   logger.info("User should see a success message");
//	}
	//Edit your Affiliate info Scenario
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPage.clickOnEditYourAffiliateLink();
		logger.info("User click on ‘Edit your affiliate information link");
		WebDriverUtility.hardWait();
	}
	@When("User click on Bank Transfer radio button")
	public void User_click_on_bank_transfer_radio_button() {
	    retailPage.clickOnBankTransferButton();
	    logger.info("user click on Bank Transfer radio button");
	    WebDriverUtility.hardWait();
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	    List<Map<String, String>> bankInfoForm = dataTable.asMaps(String.class, String.class);
	    WebDriverUtility.hardWait();
	    retailPage.enterBankName(bankInfoForm.get(0).get("bankName"));
	    WebDriverUtility.hardWait();
	    retailPage.enterBankBranchNumber(bankInfoForm.get(0).get("abaNumber"));
	    WebDriverUtility.hardWait();
	    retailPage.enterBankSwiftCode(bankInfoForm.get(0).get("swiftCode"));
	    WebDriverUtility.hardWait();
		retailPage.enterBankAccountName(bankInfoForm.get(0).get("accountName"));
		WebDriverUtility.hardWait();
		retailPage.enterBankAccountNumber(bankInfoForm.get(0).get("accountNumber"));
		
		logger.info("User filled Bank information");
		WebDriverUtility.hardWait();
	}
	
	//duplicate methods
//	@And ("User click on Continue button")
//	public void User_click_On_Continue_button() {
//		retailPage.clickOnContinueBtn();
//	}
	
//	@Then("User should see a success message")
//	public void user_should_see_a_success_message() {
//		Assert.assertTrue(retailPage.isSuccessMessagePresent());
//		logger.info("success message is present");
//	    
//	}
	
	//Edit Account Information Scenario
	@When("User click on {string} link")
	public void user_click_on_link(String string) {	
		retailPage.clickOnEditAccountInfoLink();
	}
	
	@And ("User modify below information")
	public void User_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> modifyAccountInfo = dataTable.asMaps(String.class, String.class);
		WebDriverUtility.hardWait();
		retailPage.enterFirstNameInput(modifyAccountInfo.get(0).get("firstname"));
		WebDriverUtility.hardWait();
		retailPage.enterLastNameInput(modifyAccountInfo.get(0).get("lastName"));
		WebDriverUtility.hardWait();
		retailPage.enterEmailInput(modifyAccountInfo.get(0).get("email"));
		WebDriverUtility.hardWait();
		retailPage.phoneInput(modifyAccountInfo.get(0).get("telephone"));
		logger.info("User modified Account information");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	
//	@And ("User click on continue button")
//	public void User_click_on_continue_button() {
//		
//	}
	
	
//	@Then("user should see a successfull message {string}")
//	public void user_should_see_a_successfull_message(String expected) {
//		Assert.assertEquals(expected, retailPage.getSuccessMessage());
//		logger.info("Account information has been modified successfully");
//		WebDriverUtility.takeScreenShot();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String string) {
//		Assert.assertTrue(retailPage.iSuccessMessagePresent());
//		logger.info("verified that success message is present");
//	}
//	
	
	
	
	
	
	
	
	

		

}
