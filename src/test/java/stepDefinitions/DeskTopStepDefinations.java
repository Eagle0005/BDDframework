package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.DesktopPageObjects;

public class DeskTopStepDefinations extends Base  {

		DesktopPageObjects desktop = new DesktopPageObjects();
		
//		@Given("^User is on Retail website$")
//		public void user_is_on_retail_website() {
//		//	openBrowser();		
//			logger.info("User is on Retail website");
//			}

		@When("^User click on Desktops tab$")
		public void user_click_on_desktops_tab() {
			desktop.clickOnDesktopclickOnDesktop();
			logger.info("User click on Desktops tab");
			}

		@When("^User click on Show all desktops$")
		public void user_click_on_show_all_desktops() {
		   desktop.clickOnShowAllDesktop();
		   logger.info("User click on Show all desktops");
			}

		@Then("^User should see all items are present in Desktop page$")
		public void user_should_see_all_items_are_present_in_desktop_page() {
			desktop.verifyAllItems();
			logger.info("User should see all items are present in Desktop page");
		}
		@And("^User click  ADD TO CART option on HPLP3065 item$")
		public void User_click_ADD_TO_CART_option_on_HPLP3065_item() {
			desktop.addToCart();
			logger.info("User click  ADD TO CART option on HPLP3065 item");
		}
		@And("^User select quantity 1$")
		public void User_select_quantity_1() {
			desktop.quantity();
			logger.info("User select quantity 1");			
		}
		@And("^User click add to Cart button")
		public void User_click_add_to_Cart_button() {
			desktop.add();
			logger.info("User click add to Cart button");
		}
		@Then("^User should see a message Success you have added HP LP 3065 to your Shopping cart$")
		public void User_should_see_a_message_Success_you_have_added_HP_LP_3065_to_your_Shopping_cart() {
			desktop.success();
			logger.info("User should see a message Success you have added HP LP 3065 to your Shopping cart");
		}
		
		
		
	}


