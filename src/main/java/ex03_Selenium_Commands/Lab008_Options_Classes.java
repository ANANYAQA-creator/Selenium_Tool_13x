package ex03_Selenium_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lab008_Options_Classes {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        //TEST1
    }
}
