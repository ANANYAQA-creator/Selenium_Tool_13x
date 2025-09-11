package ex_10_Selenium_ActionClass_Mouse_Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab01_ActionClass_Spicejet {

    @Test

    public void spicejet_ActionClass(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source_From_inputbox = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        // Using Action class
        Actions actions = new Actions(driver);

        //Move to the element
        // Click on the Element
        // Sendkeys --> BLR

        actions.moveToElement(source_From_inputbox).click().sendKeys("BLR").moveToElement(destination).click().sendKeys("DEL").build().perform();

        //actions.moveToElement(source_From_inputbox).click().sendKeys("BLR").build().perform();
        //actions.moveToElement(destination).click().sendKeys("DEL").build().perform();

    }


}
