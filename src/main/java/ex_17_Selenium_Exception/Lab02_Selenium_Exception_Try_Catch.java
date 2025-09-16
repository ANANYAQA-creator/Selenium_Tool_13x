package ex_17_Selenium_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab02_Selenium_Exception_Try_Catch {

    @Test
    public void NoSuchElementException_fix_Try_Catch(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.id("ananya"));
        } catch (NoSuchElementException e){
            System.out.println(" NoSuchElementException found");
        }
    }
}
