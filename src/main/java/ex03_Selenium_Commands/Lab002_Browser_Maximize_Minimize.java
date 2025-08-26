package ex03_Selenium_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab002_Browser_Maximize_Minimize {
    public static void main(String[] args) {

        /* quit() and close()
         quit closes all the tab from Open Browser window/Tab
         Close can close the current Browser window/Tab */

        //MAXIMIZE

        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.youtube.com");
        chromedriver.manage().window().maximize();
        chromedriver.quit();

        // MINIMIZE
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("https://www.facebook.com");
        firefoxdriver.manage().window().minimize();
        firefoxdriver.quit();

    }
}
