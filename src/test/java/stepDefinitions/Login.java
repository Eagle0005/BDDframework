package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.LogInPageObjects;

public class Login extends Base{
	
	LogInPageObjects login = new LogInPageObjects();
	
	@Given("^User is on Retail Website$")
	public void user_is_on_retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		//Assertion checks the expected vs the actual and will fail if it is not and stop test case
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected Title");
		}
	
	@When ("^User Click On Myaccount$")
	public void User_Click_On_Myaccount() {
		login.Myaccounta();
		logger.info("User Click On Myaccount");
	}
	@And("^User Click on Login Option$")
	public void User_Click_on_Login_Option() {
		login.clickloginbutton();
		logger.info("User Click on Login Option");
		
	}
	@When("User Enter Username {string} and Password {string}")
	public void User_Ente_UserName_and_Password (String emailv, String passwordm) {
		login.emaila(emailv);
		login.passworda(passwordm);
		logger.info("User"+emailv + "and password "+passwordm);
		
	}
	
	@And("^User Click On Login Button$")
	public void User_Click_On_Login_lOption() {
		login.loginclicka();
		logger.info("User Click on Login lOption");
		
	}
	@Then("^User Should Be Login To Myaccount Dashboard")
	public void User_Should_Be_login_to_Myaccount_Dashboard() {
		Assert.assertTrue(login.myAccountTextisPresent());
		logger.info("User Should Be Login To Myaccount Dashboard");
	}
		
	
	

}
