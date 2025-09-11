package ex_10_Selenium_ActionClass_Mouse_Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lab05_ActionClass_Drag_Drop {

    @Test

    public void Drag_Drop (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();



        // Using Action classes for Drag and Drop

        Actions actions = new Actions(driver);

        WebElement BoxA = driver.findElement(By.id("column-a"));
        WebElement BoxB = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(BoxA,BoxB).build().perform();

    }
}
