package ex_09_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab01_SVG {

    @Test
    public void test_Flipkart_Search() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search");
        //   System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement search_box = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        search_box.sendKeys("macmini");

        //for single element

        //  WebElement svg_elements = driver.findElement(By.xpath("//button[@type=\"submit\"]//*[local-name()=\"svg\"]"));
        //  svg_elements.click();

        // For Multiple Element

        List<WebElement> svg_elements = driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
        svg_elements.get(0).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]")));


        List<WebElement> title_testresult = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));
        // Use for loop
        for (WebElement title : title_testresult) {
            System.out.println(title.getText());
        }

        //For next page = Until next button is visible using for loop

        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while (next_button.isDisplayed()) {

            WebElement next_page = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_page.click();

            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]")));

            List<WebElement> test_result_nextpage = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));

            //using for loop

            for (WebElement title1 : test_result_nextpage) {
                if (title1.getText() != null) {
                    System.out.println(title1.getText());
                }


            }
        }
    }
}