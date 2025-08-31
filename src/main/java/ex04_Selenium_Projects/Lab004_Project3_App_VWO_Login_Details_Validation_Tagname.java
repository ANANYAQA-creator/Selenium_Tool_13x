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

public class Lab004_Project3_App_VWO_Login_Details_Validation_Tagname {

//TEST
/* MINI PROJECT 3
You need to basically go to app.vwo.com,
then click on the "Start a Trial" button.
Then you need to add an invalid email and verify,
and click on the radio box also. And then verify that the
"Create" button is not clickable and you get an error which is
"The email address you have entered is incorrect."

ID, ClassName, Name,
LinkText, PartialLink -> a tag -> anchor Tag
   */
    @Owner("Ananya Rawte")
    @Description("Verify the incorrect Email Pop-Up validation after Login Vwo.com")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Test_Email_Validation_Login_Vwo() {

        // OPen the VWO.com first
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Click on Start a free trial

    /*<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
     class="text-link Td(n)"
     data-qa="bericafeqo"
     >Start a free trial</a>  [LinkText]  */

        // LinkTEXT = FUll MATCH

        WebElement a_Tag_free_Trial_FullMatch = driver.findElement(By.linkText("Start a free trial"));
        a_Tag_free_Trial_FullMatch.click();


        // PARTIAL LINK TEXT = half match also can consider

        // Start a free
        //Start a
        //trial
        // free trial

        // WebElement a_Tag_free_Trial_PartialMatch = driver.findElement(By.partialLinkText("free trial"));
        //a_Tag_free_Trial_PartialMatch.click();

        // ASSERTIONS

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Enter the details in the Business Email Box

        /*
   <input class="W(100%) Py(14px) input-text"
   placeholder="name@yourcompany.com"
   type="email"
   id="page-v1-step1-email"
   name="email"
   data-qa="page-su-step1-v1-email"
   required="" fdprocessedid="puz25t">
        */

        WebElement Business_Email = driver.findElement(By.id("page-v1-step1-email"));
        Business_Email.sendKeys("abc");

        /* Click on Agree Button
        <input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        type="checkbox"
        name="gdpr_consent_checkbox"
        id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        value="true"
        data-qa="page-free-trial-step1-gdpr-consent-checkbox">*/

        WebElement Check_Agree_Button = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        Check_Agree_Button.click();

        // Click on Create a Free Trial Account
        /*<button type="submit"
        class="button W(100%) btn-modal-form-submit"
        data-qa="page-su-submit">Create a Free Trial Account</button>*/

        WebElement Clickbutton_Create_a_Free_Trial_Account = driver.findElement(By.tagName("button"));
        Clickbutton_Create_a_Free_Trial_Account.click();


        // Verify the PopUp email incorrect text

        /*<div class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1)
        invalid-reason">The email address you entered is incorrect.</div>*/

        WebElement Error_Email_Msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(Error_Email_Msg.getText(), "The email address you entered is incorrect.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
