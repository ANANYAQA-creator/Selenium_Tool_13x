package ex04_Selenium_Projects;

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

public class Lab02_Project2_App_VWO_Locators_ID_Name {
 /* ## **Practice Selenium Project #2**
 // Step 1 - Find the EMAIL ID and enter the [﻿admin@admin.com](mailto:admin@admin.com).
 // Step 2 - Find the Password and enter the 1234.
 // Step 3 - Find the Submit and click on the button.
 // Step 4 - Wait some time.
 // Step 5 - Verify the message error message.

*/

    @Description ("Verify the invalid login, error message should be display")
    @Owner("Ananya Rawte")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void Verify_Test_VWO_Invalid_Login ()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        /* Can also use Chrome Options for Maximize the web page

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");  */

        // Step 1 - Find the EMAIL ID and enter the [﻿admin@admin.com](mailto:admin@admin.com).

     /* <input type="email"
        class="text-input W(100%)"
        name="username"
        id="login-username"
        data-qa="hocewoqisi"> */

       WebElement email_input_box = driver.findElement(By.id("login-username"));
       email_input_box.sendKeys("admin.admin@co");


// Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

       WebElement Password_input_box = driver.findElement(By.id("login-password"));
       Password_input_box.sendKeys("1234");


// 3. Find the submit button and click on it.
        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >

       WebElement Submit_button_click = driver.findElement(By.id("js-login-btn"));
       Submit_button_click.click();

       // Step 4 - Wait some time.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Error Message :- ");

        //Step 5 - Verify the message error message.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement Error_Message = driver.findElement(By.className("notification-box-description"));
        System.out.println(Error_Message.getText());

        // We have to add testNG assertion to verify

        Assert.assertEquals(Error_Message.getText(),"Your email, password, IP address or location did not match");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

}
