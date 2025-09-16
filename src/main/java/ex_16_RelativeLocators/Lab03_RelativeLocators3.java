package ex_16_RelativeLocators;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab03_RelativeLocators3 {

    @Test
    public void AQI(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        // Search Box

        WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchbox.sendKeys("india" + Keys.ENTER);

        WaitHelpers.waitJVM(5000);

        // Find Locations

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for (WebElement location : locations){

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String AQI = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();
            System.out.println(  "| +" + rank + "|" + location.getText() + "|" + AQI + "|");
        }

    }
}
