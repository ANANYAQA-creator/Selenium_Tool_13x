package ex02_Selenium_Basics2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab001_TestSelenium02 {

    @Test

    public void TestSelenium01(){


        //Start and Stop himself
        // IF we have Selenium 3 then we have to do this:-
        // System.getProperty("Webdriber.gecko.driver","C:\Users\Black Panther\Downloads\geckodriver");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

    }
}