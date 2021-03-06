import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTest {

    WebDriver driver;

    // This was first test where we did not use set up method and did not use page object model

    @Test
    public void test (){
	// write your code here
        System.setProperty("webdriver.chrome.driver" ,  "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
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