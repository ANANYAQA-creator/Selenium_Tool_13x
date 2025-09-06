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

import java.util.List;

public class Lab02_Katalon_project {

    @Owner("AnanyaQA")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify Katalon login flow")
    @Test (groups = "AnanyaQA")

    public void Katalon_cura_Login ()
    {
        //Open the Katalon cura website

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        //Click on Make Appointment

        WebElement make_appointment = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        make_appointment.click();

        /*
        //  Fill username section

        WebElement input_username = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        input_username.sendKeys("John Doe");

        // Fill password section
        WebElement input_password = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        input_password.sendKeys("ThisIsNotAPassword");*/

        //Using List of webelement

        List<WebElement> username = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username.get(1).sendKeys("John Doe");

        List<WebElement> userpassword = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        userpassword.get(1).sendKeys("ThisIsNotAPassword");

        // Click on Login
        WebElement login_button = driver.findElement(By.xpath("//button[text()='Login']"));
        login_button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        //h2[text()='Make Appointment']
        WebElement h2 = driver.findElement(By.xpath("h2[text()='Make Appointment']"));
        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());
    }

}
