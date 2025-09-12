package ex_13_Selenium_JavaScriptExecutor;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab02_JS_executor {

    @Test
    public void JS_executor (){

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location ='https://www.google.com'");
        WaitHelpers.waitJVM(2000);

        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollBy(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();


        System.out.println(url);
        System.out.println(title);
    }
}
