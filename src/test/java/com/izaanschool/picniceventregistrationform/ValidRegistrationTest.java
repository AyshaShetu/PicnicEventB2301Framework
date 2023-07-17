package com.izaanschool.picniceventregistrationform;
import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnicEventPage;
import com.izaanschool.page.RegistrationPage;
//import com.izaanschool.pages.LoginPage;
//import com.izaanschool.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ValidRegistrationTest extends BaseTest {
    @Test
    public void validCredentialTest(){
        //creating picnic event page object
        PicnicEventPage picnicEventPage = new PicnicEventPage(driver, log);
        //Go to reg form Page/url
        picnicEventPage.openPage();

        // registration page object create to use method from Registration Page
        RegistrationPage registrationPage = new RegistrationPage(driver, log);
        // putting valid credential and click submit button inside from registerWithValidCredentials()
        registrationPage.registerWithValidCredentials("John ", "afshetu@gmail.com", "2146036884", "2", "2");
       // registrationPage.clickOkButtoninAlertmessage();

        log.info("Registration successful");

        // successful registration message ??????????????
       // String message = registrationPage.getLoginSucceedMessageText();

        // Verification ?????????????
        //Assert.assertTrue(message.contains(registrationPage.getLoginSucceedMessageText()), "No assertion element found for pop in message.");
  }


}
