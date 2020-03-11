import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DemoTest {

    WebDriver driver;

    // This was first test where we did not use set up method and did not use page object model

    @Test
    public void test () throws MalformedURLException {
	// write your code here
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("47");
        capabilities.setPlatform(Platform.MOJAVE);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi.herokuapp.com");




//        WebElement bagCategory = driver.findElement(By.linkText("Bags"));
//        bagCategory.click();
//
//        WebElement bags = driver.findElement(By.cssSelector("[title='Ruby on Rails Bag']"));
//
//        String actualText = bags.getText();
//        System.out.println( "actualText: " + actualText);
//        WebElement secondBag = driver.findElement(By.cssSelector("[alt='Ruby on Rails Bag']"));

        Select category = new Select(driver.findElement(By.id("taxon")));
        category.selectByVisibleText("Brands");
//        category.selectByIndex(2);
//        category.selectByValue("5");




//        Assert.assertEquals(driver.getTitle(),"Google");
//        driver.close();
    }
}