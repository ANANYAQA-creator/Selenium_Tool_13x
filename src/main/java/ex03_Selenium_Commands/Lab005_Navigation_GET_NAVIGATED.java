package ex03_Selenium_Commands;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab005_Navigation_GET_NAVIGATED {

    @Description ("Open the URL")

    @Test

    public void selenium_navigate(){

        /*Difference b/w get and navigate

         get() - there is no option of Back,Forward,Refresh

         navigate.to()
         back()
         forward()
         refresh()

          */
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        // navigate command

        // navigate.to command
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        driver.close();
    }

}
