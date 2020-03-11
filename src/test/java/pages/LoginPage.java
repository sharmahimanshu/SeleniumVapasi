package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This home page refers to 'https://spree-vapasi.herokuapp.com/login'
public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.id("spree_user_email");
    By password = By.id("spree_user_password");
    By loginButton = By.name("commit");

    public void setUsername() {
        driver.findElement(username).sendKeys("spree@example.com");
    }

    public void setpassword() {
        driver.findElement(password).sendKeys("spree123");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
