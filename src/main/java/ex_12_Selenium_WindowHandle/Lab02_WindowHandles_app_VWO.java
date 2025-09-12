package ex_12_Selenium_WindowHandle;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab02_WindowHandles_app_VWO {

    @Test
    public void login_appVWO(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();

        WaitHelpers.waitJVM(5000);

        String parent_id = driver.getWindowHandle();
        System.out.println("Parent_window_id :-" + parent_id);

        // Box for URL
        WaitHelpers.waitJVM(2000);
        WebElement user_input = driver.findElement(By.name("primaryUrl"));
        user_input.clear();
        user_input.sendKeys("https://thetestingacademy.com/");

        WaitHelpers.waitJVM(2000);

        // Click on ViewHeatmap

        WebElement click_ViewHeatMap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        click_ViewHeatMap.click();

        WaitHelpers.waitJVM(15000);


        // 2 window handles

        Set<String> all_window_handle = driver.getWindowHandles();
        System.out.println("all_windowHandle" + all_window_handle);

        for (String child_window : all_window_handle){

            if (!child_window.equals(parent_id));
            {
                driver.switchTo().window(child_window);
                driver.switchTo().frame("heatmap-iframe");

                WaitHelpers.waitJVM(2000);

             //   System.out.println(driver.getPageSource());      // for Page source details

                WebElement click_compare_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                //Direct click is not working here so we use action classes

                Actions actions = new Actions(driver);
                actions.moveToElement(click_compare_button).click().build().perform();
                WaitHelpers.waitJVM(3000);
            }
        }

    }
}
