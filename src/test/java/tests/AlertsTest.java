package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePage_2;
import pages.LoginPage;

public class AlertsTest extends Base {

    HomePage_2 obj;

    @Test
    public void verifylogin (){
        obj = new HomePage_2(driver);
        obj.clickJsConfirmButton();
//        obj.clickJsAlertButton();
//        obj.acceptAlert();
        obj.dismissAlert();
    }

    @Test
    public void verifyWindowHandle (){
        obj = new HomePage_2(driver);
        obj.clickonClickHere();
    }
}