package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver=null;

    @BeforeMethod
        public void setup() {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://spree-vapasi.herokuapp.com");
        driver.get("http://the-internet.herokuapp.com");
    }

    public void close() throws Exception {
        driver.close();
    }
}