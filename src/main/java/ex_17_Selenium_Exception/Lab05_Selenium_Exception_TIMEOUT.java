package ex_17_Selenium_Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab05_Selenium_Exception_TIMEOUT {

    @Test
    public void Timeout_Exception_fix (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebDriverWait explicit_wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        explicit_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("abc")));

        WebElement Search_Box_element1 = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
        Search_Box_element1.sendKeys("TVS RONIN" + Keys.ENTER);

        // org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: abc (tried for 10 second(s) with 500 milliseconds interval)

    }
}