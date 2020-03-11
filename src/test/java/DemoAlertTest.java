import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.URL;

public class DemoAlertTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://Jenkins.ip.here:4444/wd/hub"), capability);
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void Alert3Test() {
        System.out.println("Testing 3rd Alert");
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        Alert alert = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.sendKeys("Hello alert");
        // Now we can accept alert, Above text will be visible on same web page under result
        alert.accept();
    }


    @DataProvider(name = "sample-data-provider")
    public Object[][] createData1() {
        return new Object[][] {{ "Bags"},{ "Mugs"}};
    }

    @Test(dataProvider = "sample-data-provider")
    public void verifySearch(String product) {
        driver.findElement(By.id("keywords")).sendKeys(product);
        System.out.println("Searched product:-> " + product );
    }



    @Test
    public void test (){
        driver.get("https://spree-vapasi.herokuapp.com");
        System.out.println("this is test");
        Assert.assertEquals(1,0);
    }

    @Test
    public void test1 (){
        driver.get("https://spree-vapasi.herokuapp.com");//
        System.out.println("this is test1");
        Assert.assertEquals(1,0);
    }
}