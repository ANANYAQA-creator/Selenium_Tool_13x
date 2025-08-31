package ex04_Selenium_Projects;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab003_Selenium_LinkText_PartialText_TagName_Locators {

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

@Description ("Verify the incorrect Email Pop-Up validation")
@Owner("Ananya Rawte")
@Test
 public void Test_Email_Validation_Login_Vwo (){

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


    // PARTIAL LINK TEXT = half match also can cosnider

   // Start a free
   //Start a
   //trial
   // free trial

  // WebElement a_Tag_free_Trial_PartialMatch = driver.findElement(By.partialLinkText("free trial"));
   //a_Tag_free_Trial_PartialMatch.click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    // Enter the details in Business Email Box
   /*<input class="W(100%) Py(14px) input-text"
   placeholder="name@yourcompany.com"
   type="email"
   id="page-v1-step1-email"
   name="email"
   data-qa="page-su-step1-v1-email"
   required="" fdprocessedid="puz25t">*/



}

}
