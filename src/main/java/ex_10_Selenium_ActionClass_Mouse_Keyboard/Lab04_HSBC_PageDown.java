package ex_10_Selenium_ActionClass_Mouse_Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab04_HSBC_PageDown {

    @Test
    public void HSBC_Page_Down(){

        WebDriver driver = new FirefoxDriver();
   //     driver.get("https://www.hsbc.co.in/");
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        // Using Action classes for Page down

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();


    }
}
