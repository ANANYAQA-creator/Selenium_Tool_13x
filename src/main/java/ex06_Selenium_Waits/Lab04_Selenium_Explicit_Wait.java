package ex06_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab04_Selenium_Explicit_Wait {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    // Find the Email id** and enter the email as admin@admin.com
    // Find the pass inputbox** and enter passwrod as admin.
    // Find and Click on the submit button
    // Wait - Thread.sleep - Replace with EW
    // Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Owner("ANANYA-QA")
    @Description("Replace the Thread sleep with Explicit wait")
    @Severity(SeverityLevel.BLOCKER)
    @Test (groups = "QA")

    public void Login_VWO_Explicitwait (){

        // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        // Find the Email id** and enter the email as admin@admin.com

        WebElement email_box = driver.findElement(By.xpath("//input[@id='login-username']"));
        email_box.sendKeys("admin@admin.com");

        // Find the pass inputbox** and enter passwrod as admin.
        WebElement password_box = driver.findElement(By.xpath("//input[@id='login-password']"));
        password_box.sendKeys("admin");


        // Click on Submit button

        WebElement signin = driver.findElement(By.id("js-login-btn"));
        signin.click();

        // here needed to use Explicit wait

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        //In Explicit wait = first DURATION = 3 second
        // Second CONDITION = Error message is displayed

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        System.out.println("Error message:- ");

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        driver.quit();


    }
}
