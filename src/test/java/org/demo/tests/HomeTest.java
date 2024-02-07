package org.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{


    @Test
    public void verifyClickingOnRegisterBTN(){
        homePage.clickRegisterBTN();
        String actualCurrentURL = driver.getCurrentUrl();
        Assert.assertEquals(actualCurrentURL,"https://demo.nopcommerce.com/register?returnUrl=%2F","Check Register Button");
    }

}
