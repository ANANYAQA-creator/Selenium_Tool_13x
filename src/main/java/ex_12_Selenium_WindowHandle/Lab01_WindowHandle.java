package ex_12_Selenium_WindowHandle;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab01_WindowHandle {

    @Test
    public void Windows_login (){

// Open the Windows website

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        // Get the parent_id
        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id); //31D26A3CFBB953F01C50623D3087DCBB

// Click here_button
        WebElement click_here_button = driver.findElement(By.xpath("//a[normalize-space()=\"Click Here\"]"));
       click_here_button.click();

// 2 windows

        Set<String> window_handleid = driver.getWindowHandles();
        System.out.println(window_handleid); //[52236AE1DAD9E31F037E48788F5A10B9, 488CDCA8C49DA007D5BDA2C59AD62B23]

        // How do I switch to the Child Window and
        // Verify that there is a text present with name of New Window ?

        for ( String child_window : window_handleid ){
            driver.switchTo().window(child_window);
            if (driver.getPageSource().contains("New Window"));{

                System.out.println("TestCase Passed");
            }

        }

        WaitHelpers.waitJVM(2000);

// Return back to main window
        driver.switchTo().window(parent_id);

    }
}
