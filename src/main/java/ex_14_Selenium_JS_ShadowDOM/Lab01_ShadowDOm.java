package ex_14_Selenium_JS_ShadowDOM;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab01_ShadowDOm {

    // JAVASCRIPT executor mostly used in ShadowDOM

    @Test
    public void Shadow_DOM (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        WaitHelpers.waitJVM(3000);

        //click on pizza by shadow root

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement input_pizzaname = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        input_pizzaname.sendKeys("farmhouse");

WaitHelpers.waitJVM(2000);

driver.close();

    }
}
