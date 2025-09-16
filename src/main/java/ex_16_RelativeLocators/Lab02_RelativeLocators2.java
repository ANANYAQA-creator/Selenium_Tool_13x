package ex_16_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab02_RelativeLocators2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        // Switch to iframe

        driver.switchTo().frame("result");

        //Submit = //button[text()="Submit"]
       driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();

       //Find the username

        WebElement username_element = driver.findElement(By.id("username"));

        //Find the  below error message

        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(username_element));

        String error_text = error_msg.getText();
        Assert.assertEquals(error_text,"Username must be at least 3 characters");




    }
}
