package ex06_Selenium_Waits;

import com.google.common.base.Function;
import ex_07_WaitHelpers.WaitHelpers;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import utils.CommontoAll;

import java.time.Duration;

public class Lab06_Selenium_Fluent_Waits extends CommontoAll {

    @Owner("ANANYA-QA")
    @Description("Replace the Thread sleep with Explicit wait")
    @Severity(SeverityLevel.BLOCKER)
    @Test(groups = "QA")

    public void Login_VWO_Explicitwait() {

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



//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        // Explicit Wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

     /*   FluentWait<WebDriver> wait = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

          WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
            @Override
          public WebElement apply(WebDriver driver) {
               return driver.findElement((By.className("notification-box-description")));
           }
       });   */

        new WaitHelpers().waitFluentVisibility(driver, 10, 2, "notification-box-description");
    }
}