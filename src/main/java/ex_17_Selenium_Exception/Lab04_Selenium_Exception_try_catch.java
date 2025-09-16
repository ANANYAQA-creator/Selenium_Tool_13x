package ex_17_Selenium_Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab04_Selenium_Exception_try_catch {

    @Test
    public void stale_element_fix (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Start of Program");


        WebElement Search_Box_element = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
        driver.navigate().refresh();
        //org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        //  (Session info: chrome=140.0.7339.128)

        //using Try Catch to fix stale element.

        try {
            Search_Box_element.sendKeys("TVS RONIN" + Keys.ENTER);
        } catch (StaleElementReferenceException e){
                System.out.println("Stale Element exception fix");
            }

        // Again to find the Search_Box_element

        WebElement Search_Box_element1 = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
        Search_Box_element1.sendKeys("TVS RONIN" + Keys.ENTER);


    }
}