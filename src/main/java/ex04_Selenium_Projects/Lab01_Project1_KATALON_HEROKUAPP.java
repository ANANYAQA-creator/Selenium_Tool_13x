package ex04_Selenium_Projects;

/*## **Practice Selenium Project #1 **
 // Open the URL
 // Get the source code
 // Verify the source Code

Important Commands

1. getTitle() - titles
2. getCurrentURL() - current url page
3. getPageSource - source code(html) - text / html
*/
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Lab01_Project1_KATALON_HEROKUAPP {

    @Description ("Verify the Text in Katalon website")
    @Link ("https://www.facebook.com")

    @Test
    public void test_verify_text_katalon() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");    // For Tc pass - Service
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");   // For Tc failed - Services
        // System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());

        if (driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test case failed");
            Assert.fail();
        }

        driver.quit();
}
}
