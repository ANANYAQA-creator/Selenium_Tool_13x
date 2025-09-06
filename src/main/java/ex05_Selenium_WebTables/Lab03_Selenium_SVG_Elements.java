package ex05_Selenium_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Lab03_Selenium_SVG_Elements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("macmini");
        List<WebElement> svgElement = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElement.get(0).click();

    }
}
