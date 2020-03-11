import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DemoCrossBrowserTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
            System.out.println("I am firefox");
            System.setProperty("webdriver.gecko.driver" ,  "/Users/lovely.munjal/Downloads/geckodriver");
            driver = new FirefoxDriver();
        driver.get("https://spree-vapasi.herokuapp.com");
    }

    @Test
    public void test (){
        driver.get("https://spree-vapasi.herokuapp.com");
        System.out.println("this is test");
        // we can add any assertions here
    }

    @Test
    public void test1 (){
        driver.get("https://spree-vapasi.herokuapp.com");//
        System.out.println("this is test1");
        // we can add any assertions here
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}