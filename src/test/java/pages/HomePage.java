package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This home page refers to 'https://spree-vapasi.herokuapp.com'
public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By loginbutton = By.linkText("Login");

    public void clickLoginButton (){
        driver.findElement(loginbutton).click();
    }
}