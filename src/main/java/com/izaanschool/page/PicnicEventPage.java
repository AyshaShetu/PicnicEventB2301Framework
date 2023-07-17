package com.izaanschool.page;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PicnicEventPage extends BasePageObject {

	// Open picnic event reg form page
	private String pageUrl = "https://develop.d2thmk3us0b2mb.amplifyapp.com";

	private By fullnameFieldLocator = By.id("name"); //Full Name
    private By emailFieldLocator = By.id("email"); //Email
	private By phoneNumberFieldLocator = By.id("phone"); // Phone Number
	private By adultFieldLocator = By.id("adults"); // Number of Adults
	private By childrenFieldLocator = By.id("children"); // Number of Children
	private By submitButtonFieldLocator = By.xpath("//*[@id=\"registration-form\"]/input[4]"); // Submit button



	// constructor initializing web-driver and logger object
	public PicnicEventPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open PicnicEventPage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	/** Open LoginPage by clicking on Form Authentication Link */
	public RegistrationPage clickSubmitButton() {
		log.info("Clicking Submit Button on PICNIC EVENT Page to register");
		click(submitButtonFieldLocator);
		return new RegistrationPage(driver, log);
	}

	public String AdultSelectionDropDown() {
		//Selecting the drop-down element as an instance of the Select class.
		Select Adult = new Select(find(adultFieldLocator));
		// select 2 adults
		Adult.selectByValue("2");
		// # Adult.selectByIndex(2);selectByVisibleText("1"); also work
		String totalAdult= Adult.getFirstSelectedOption().getText();
		log.info(totalAdult+ " is selected");
		return totalAdult;
	}

	public String childrenSelectionDropDown() {
		//Selecting the drop-down element as an instance of the Select class.
		Select Children = new Select(find(childrenFieldLocator));
		// select 1 Children
		Children.selectByValue("1");
		// #Children.selectByIndex(2); selectByVisibleText("1"); also work
		String totalChildren= Children.getFirstSelectedOption().getText();
		log.info(totalChildren+ " is selected");
		return totalChildren;
	}
}
