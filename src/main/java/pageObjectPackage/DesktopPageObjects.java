package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.UtilityClasses;

	public class DesktopPageObjects extends Base {
		// in this class we will store UI elements of Desktop WEbpage
		// we will implement PageFactory.initElement method to initialize the page elements
		// we will use @Findby annotations to store UI WebElements
		// we will store UI Elements as Private WebElements and access them
		// through public methods and we will write the function inside the public methods.
		/**
		 * This constructor will use to initialize the Webelements inside this POM class
		 * we will create PageFactory.initElements method inside the constroctor
		 */
		public DesktopPageObjects() {
			PageFactory.initElements(driver, this);
		}
		// page factory class provides an annotation @Findby to find UI elements
		// @Findby == driver.findElement()
		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktop;

		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement showAllDesktop;

		@FindBy(xpath = "//div[@id='product-category']")
		private WebElement itemsArePresent;
		
		@FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[3]")
		private WebElement addToCart;
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement quantity;
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement add;
		
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement sucess;

		public void clickOnDesktopclickOnDesktop() {
			
			desktop.click();
		}

		public void clickOnShowAllDesktop() {
			showAllDesktop.click();

		}

		public void verifyAllItems() {
			UtilityClasses.takeScreenShot();
		}
		public void addToCart() {
			addToCart.click();
		}
		public void quantity() {
			quantity.clear();
			quantity.sendKeys("1");
			
		}
		public void add() {
			add.click();
		}
		public void success() {
			UtilityClasses.screenShotName();
		}
	}


