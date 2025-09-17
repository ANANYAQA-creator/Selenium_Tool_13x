package ex_18_Selenium_DDT_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab04_Selenium_DDT_Real {

    @Test (dataProvider = "getData")
    public void test_Login_VWO (String email,String password){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // Email inputbox
        WebElement email_inputbox = driver.findElement(By.name("username"));
        email_inputbox.sendKeys(email);

        // Password Box
        WebElement email_passwordbox = driver.findElement(By.name("password"));
        email_passwordbox.sendKeys(password);

        // Submit Button
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // Explicit wait for visibility of element located

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        }

    @DataProvider()
    public Object[][] getData(){

        // Read the data from excel file
        // Give them in the 2D array

        return UtilExcel2.getDataFromExcel("Sheet1");
    }

}
