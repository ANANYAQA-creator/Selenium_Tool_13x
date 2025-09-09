package ex_08_Selenium_Input_Checkbox_Radio;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab005_Selenium_Modal {

    public static void main(String[] args) {

        // MMT - click to close the modals

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

       //new WaitHelpers().waitJVM(5000);
       new WaitHelpers().waitForVisibility(driver,5000,"//span[@data-cy=\"closeModal\"]");

        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close_modal.click();


    }
}
