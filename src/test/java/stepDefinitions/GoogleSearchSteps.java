package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import core.Base;
import io.cucumber.java.en.*;

public class GoogleSearchSteps extends Base {


	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");
	}

	@When("userr enters a text in search box")
	public void userr_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Mindtree");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Careers");
		
	}
}
