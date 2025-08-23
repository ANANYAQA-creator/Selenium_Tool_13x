package ex02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab003_Selenium_LaunchBrowser_Url {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.close();
    }
}
