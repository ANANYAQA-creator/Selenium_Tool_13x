package ex03_Selenium_Commands;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab006_NoHTTP {

    // Without HTTP is code work ? Ans. NO

    @Description ("Without HTTP is code work? NO ")
    @Test

    public void noHTTP(){

        WebDriver driver = new FirefoxDriver();
       // driver.get("facebook.com");
        driver.get("https://facebook.com");  // HTTP is important
        driver.quit();
    }
}
