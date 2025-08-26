package ex03_Selenium_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab001_Selenium_Commands {
    public static void main(String[] args) {

        // getTitle() , getCurrentUrl() ,  getPageSource()

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit(); // Close all the Open tab
    }
}
