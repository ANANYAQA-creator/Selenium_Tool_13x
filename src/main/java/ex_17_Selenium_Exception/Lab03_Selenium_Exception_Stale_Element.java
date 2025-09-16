package ex_17_Selenium_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab03_Selenium_Exception_Stale_Element {

    @Test
    public void stale_element(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Start of Program");


        WebElement Search_Box_element = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
        driver.navigate().refresh();
        //org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        //  (Session info: chrome=140.0.7339.128)

        Search_Box_element.sendKeys("TVS RONIN" + Keys.ENTER);

    }
}
