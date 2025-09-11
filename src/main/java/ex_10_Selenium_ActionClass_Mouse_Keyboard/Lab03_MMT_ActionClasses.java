package ex_10_Selenium_ActionClass_Mouse_Keyboard;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab03_MMT_ActionClasses {

    @Test
    public void MMT_ac() {

        // Login to MMT
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        // Wait for the Modal and close the modal
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close_modal.click();

        // Sendkeys-->IXC and then  choose the 2nsd options from dropdown

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        //Using Action Class
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        new WaitHelpers().waitJVM(3000);

        // Finding all the elements from Dropdown and click on the Chandigarh by using for loop
        List<WebElement> Suggestion_List = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for (WebElement e : Suggestion_List) {

                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }
            }
        } catch (Exception e) {
            System.out.println("OK");
        }

        actions.moveToElement(toCity).click().sendKeys("PNQ").build().perform();

        List<WebElement> to_suggestion = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e1 : to_suggestion){
            if (e1.getText().contains("Pune")){
                e1.click();
            }
        }


    }
}
