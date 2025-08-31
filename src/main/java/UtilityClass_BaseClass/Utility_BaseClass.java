package UtilityClass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility_BaseClass {

    //Open Browser

    public WebDriver driver;

    public void openBrowser (WebDriver driver, String url){

        driver.get(url);
        driver.manage().window().maximize();
    }

    // Close Browser

    public void CloseBrowser (WebDriver driver) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
