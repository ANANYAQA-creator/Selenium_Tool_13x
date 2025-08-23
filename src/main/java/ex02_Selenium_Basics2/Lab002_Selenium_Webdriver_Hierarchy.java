package ex02_Selenium_Basics2;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab002_Selenium_Webdriver_Hierarchy {
    public static void main(String[] args) {
/*
        Webdriver Hierarchy

        // SearchContext[I] = 2 - find element and find elements
        // Webdriver [I] = 10("get")
        // Remote Webdriver(C) = 15
        // ChromiumWebdriver[C]= 25 // Chromium is Open Source project. It's basically a Browser engine
        // EdgeWebdriver[C] = 45

    GGF    // SearchContext -> Interface -> 2 = find element and find elements
     GF    // Webdriver ->Interface = 10("get") some incomplete functions
      F    // Remote Webdriver -> Class -> It also has some functions = 15
           // Chrome driver,Edge driver,Internet Explorer Driver,Firefox driver


        //Using SearchContext - Here only two functions -find element and findelements are available
          //DYNAMIC DISPATCH

           SearchContext driver = new ChromeDriver();
           // driver.findElement ();
        //  driver.findElements ();

         WebDriver driver1  = new ChromeDriver();
         driver1.get("");

        RemoteWebDriver driver2 = new FirefoxDriver();
        driver2.get("");

        ChromeDriver driver3 = new ChromeDriver();
        driver3.get("");

        //SCENARIOS :-
        //1. Do you want to run on Chrome or Edge Browser ? [2-3%]

        // If want to use ChromeBrowser
        ChromeDriver cdriver = new ChromeDriver();
        cdriver.get("");

        //OR

        // If you want to use Edge Browser
        EdgeDriver edriver = new EdgeDriver();
        edriver.get("");
*/


        //2. Do you want to use first Chrome Browser then shift to Edge Browser ? [95-96%]
        WebDriver driver6 = new ChromeDriver();
        driver6.get("https://www.amazon.com");
        driver6 = new EdgeDriver();
        driver6.get("https://www.flipkart.com");

        //3. Do you want to use multiple browser, AWS machine ?  [2-3%]
      //  RemoteWebDriver driver [WithGrid] =  advance [will cover on last 2 session]


    }
}
