package com.izaanschool.picniceventregistrationform;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnicEventPage;
import com.izaanschool.page.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class numberOfAdultSelectionTest extends BaseTest {

    @Test
    public  void numberOfAdultSelection(){
    //creating picnic event page object
    PicnicEventPage picnicEventPage = new PicnicEventPage(driver, log);
    //Go to reg form Page/url
	 picnicEventPage.openPage() ;

    //select no of adult using index no.3 and get the ext
    String actualAdultNumber= picnicEventPage.AdultSelectionDropDown();
        System.out.println("I select : " + actualAdultNumber);
        Assert.assertEquals(actualAdultNumber, "2");
       System.out.println("***TEST PASSED AND ASSERTED***");
      }
}
