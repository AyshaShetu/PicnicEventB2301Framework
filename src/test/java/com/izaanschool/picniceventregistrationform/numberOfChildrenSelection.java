package com.izaanschool.picniceventregistrationform;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnicEventPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class numberOfChildrenSelection extends BaseTest {
    @Test
    public  void ChildrenSelection(){
        //creating picnic event page object
        PicnicEventPage picnicEventPage = new PicnicEventPage(driver, log);
        //Go to reg form Page/url
        picnicEventPage.openPage() ;

        //select no of adult using index no.3 and get the ext
        String NumberOfChildren = picnicEventPage.AdultSelectionDropDown();
        System.out.println("I select : " + NumberOfChildren);
        Assert.assertEquals(NumberOfChildren, "1");
        System.out.println("***TEST PASSED AND ASSERTED***");
    }
}
