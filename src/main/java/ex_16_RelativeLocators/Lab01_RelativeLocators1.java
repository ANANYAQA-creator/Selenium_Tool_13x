package ex_16_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab01_RelativeLocators1 {
    public static void main(String[] args) {

        //  PRACTICE HTML

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        // toRightOf
        WebElement YOE2 = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement(with(By.id("exp-1")).toRightOf(YOE2)).click();

    }
}
