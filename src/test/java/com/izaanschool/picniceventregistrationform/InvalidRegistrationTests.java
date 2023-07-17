package com.izaanschool.picniceventregistrationform;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnicEventPage;
import com.izaanschool.page.RegistrationPage;
//import com.izaanschool.pages.LoginPage;
//import com.izaanschool.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvalidRegistrationTests extends BaseTest {

	@Test
	public void invalidCredentialTest(){
		//creating picnic event page object
		PicnicEventPage picnicEventPage = new PicnicEventPage(driver, log);
		//Go to reg form Page/url
		picnicEventPage.openPage();

		// registration page object create to use method from Registration Page
		RegistrationPage registrationPage = new RegistrationPage(driver, log);
		// putting valid credential and click submit button inside from registerWithValidCredentials()
		registrationPage.registerwithInvalidCredential("John ", "j@mail.com", "214567890", "11", "12");
		registrationPage.clickOkButtoninAlertmessage();

		log.info("Registration unsuccessful");

//    ***********need to work on ************
		// wait for error message
//		registrationPage.waitForErrorMessage();
//		String message = registrationPage.getErrorMessageText();

		// Verification
		//Assert.assertTrue(message.contains(registrationPage.getErrorMessageText()), "Message doesn't contain expected text.");
	}
}