package ex_13_Selenium_JavaScriptExecutor;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01_JS_executor_withoutDriverget_Function {

    // How to navigate website without using driver.get function

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");

        WaitHelpers.waitJVM(3000);

        driver.close();
    }


}
