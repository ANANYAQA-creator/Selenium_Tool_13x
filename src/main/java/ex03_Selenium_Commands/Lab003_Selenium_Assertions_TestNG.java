package ex03_Selenium_Commands;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class Lab003_Selenium_Assertions_TestNG {

    //Assertion =  actual result is matched with expected result or not is known as Assertions.

    @Description("Verify that the title is Visible")

    @Test
    public void selenium_assertion (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //TestNG Assertions

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //assertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }
}
