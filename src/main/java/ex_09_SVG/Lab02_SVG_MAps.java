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

public class Lab02_SVG_MAps {

    @Test
    public void click_Tripura(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg.maps/?map=india");
        driver.manage().window().maximize();

        //Explicit wait =

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']")));


        // States :- //*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']

        List<WebElement> states_name = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for (WebElement state: states_name){
            System.out.println(state.getDomAttribute("aria-label"));  // all states

            if (state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }
            }

        }
    }

