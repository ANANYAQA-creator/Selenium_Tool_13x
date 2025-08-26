package ex03_Selenium_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab007_Close_Quit {

    public static void main(String[] args) {
        // Close can close the current browser/window/tab.

        WebDriver fdriver = new FirefoxDriver();
        fdriver.get("https://www.google.com");

        fdriver.switchTo().newWindow(WindowType.TAB);
        fdriver.get("https://www.youtube.com");

        fdriver.close(); // it will close current youtube tab/window/browser


        //Quit - can close all the browser/Window/Tab

        WebDriver cdriver = new ChromeDriver();
        cdriver.get("https://www.facebook.com");

        cdriver.switchTo().newWindow(WindowType.TAB);
        cdriver.get("https://www.zomato.com");

        cdriver.quit();
    }
}
