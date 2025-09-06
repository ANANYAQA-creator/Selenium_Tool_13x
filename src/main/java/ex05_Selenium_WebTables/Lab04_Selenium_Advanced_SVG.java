package ex05_Selenium_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Lab04_Selenium_Advanced_SVG {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg.maps/?map=india");
        driver.manage().window().maximize();

        // States :- //*[local-name()='svg']/*[name()='g'][7]//*[name()='g']//*[name()='g']/*[name()='path']

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]//*[name()='g']//*[name()='g']/*[name()='path']"));

        for (WebElement state : states) {
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }
          driver.quit();
    }
}
