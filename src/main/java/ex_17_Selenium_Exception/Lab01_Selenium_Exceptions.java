package ex_17_Selenium_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab01_Selenium_Exceptions {

    @Test

    public void NoSuchExceptionElement (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("ananya"));

        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#ananya"}
        //  (Session info: chrome=140.0.7339.128)


    }
}
