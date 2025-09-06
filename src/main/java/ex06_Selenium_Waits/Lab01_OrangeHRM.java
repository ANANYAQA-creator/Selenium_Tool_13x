package ex06_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Lab01_OrangeHRM {

    @Owner("Ananya")
    @Description("Verify Login is working")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void Orange_HRM_login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        login_button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

        WebElement h6= driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

        driver.close();
    }
}
