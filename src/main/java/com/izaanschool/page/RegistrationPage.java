package com.izaanschool.page;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePageObject {

	private By fullnameFieldLocator = By.id("name"); //Full Name
	private By emailFieldLocator = By.id("email"); //Email
	private By phoneNumberFieldLocator = By.id("phone"); // Phone Number
	private By adultFieldLocator = By.id("adults"); // Number of Adults
	private By childrenFieldLocator = By.id("children"); // Number of Children
	private By submitButtonFieldLocator = By.xpath("//*[@id=\"registration-form\"]/input[4]"); // Submit button
	private By errorMessageLocator = By.id("flash"); //?????????????????

	public RegistrationPage(WebDriver driver, Logger log) {
		super(driver, log);
	}


	public void registerwithInvalidCredential(String fullName, String email, String phoneNumber, String numOfadults, String numOfChildren) {
		log.info("Executing Invalid Registration with Full Name: [" + fullName + "] , Email: [" + email + "] , Phone Number: [" + phoneNumber + "] , Number of Adults: [" + numOfadults + "] and Number of Children (under 12 years old): [" + numOfChildren + "]");
		type(fullName, fullnameFieldLocator);
		type(email, emailFieldLocator);
		type(phoneNumber, phoneNumberFieldLocator);
		type(numOfadults, adultFieldLocator);
		type(numOfChildren, childrenFieldLocator);

		click(submitButtonFieldLocator);
	}

	/**
	 * Wait for error message to be visible on the page
	 */
	public void waitForErrorMessage() { //?????????????
		waitForVisibilityOf(errorMessageLocator, 5);
	}

	public String getErrorMessageText() { //?????????????????
		return find(errorMessageLocator).getText();
	}

//}


	public void registerWithValidCredentials(String fullName, String email, String phoneNumber, String numOfadults, String numOfChildren) {
		log.info("Executing Valid Registration with Full Name: [" + fullName + "] , Email: [" + email + "] , Phone Number: [" + phoneNumber + "] , Number of Adults: [" + numOfadults + "] and Number of Children (under 12 years old): [ + numOfChildren + ]");
		type(fullName, fullnameFieldLocator);
		type(email, emailFieldLocator);
		type(phoneNumber, phoneNumberFieldLocator);
		type(numOfadults, adultFieldLocator);
		type(numOfChildren, childrenFieldLocator);

		click(submitButtonFieldLocator);
	}



	public void clickOkButtoninAlertmessage(){
		switchToAlert().accept();
	}
	/**
	 * Wait for successful login message to be visible on the page
	 */
	public void waitForSuccessMessage() {
		waitForVisibilityOf(errorMessageLocator, 5);
	}

	public String getLoginSucceedMessageText() {
		return find(errorMessageLocator).getText();
	}
}