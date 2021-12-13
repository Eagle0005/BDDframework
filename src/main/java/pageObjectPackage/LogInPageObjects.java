package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LogInPageObjects extends Base{

	
	public LogInPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccount;
	
	@FindBy (xpath = "//a[text() = 'Login']")
	private WebElement loginbutton;
	
	@FindBy (xpath ="//input[@id='input-email']")
	private WebElement email;
	
	@FindBy (xpath ="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy (xpath ="//input[@value='Login']")
	private WebElement loginclick;

	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	
	public void Myaccounta() {
		MyAccount.click();
	}
	
	public void clickloginbutton() {
		loginbutton.click();
	}
	
	public void emaila(String emailv) {
		email.sendKeys(emailv);
	}
	public void passworda(String passwordm) {
		password.sendKeys(passwordm);
	}
	
	public void loginclicka() {
		loginclick.click();
	}
	public boolean myAccountTextisPresent() {
		if (myAccountText.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		}
	
}
