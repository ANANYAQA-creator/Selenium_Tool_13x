package Selenium_And_BDD_Cucumber.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.sql.DriverManager;
import java.time.Duration;

public class BasePage {

    // WebDriver =Chromedriver
    public void Open_Browser (WebDriver driver1, String url){
        driver1.get(url);
        driver1.manage().window().maximize();

    }

    static  WebDriver driver2;

    @BeforeMethod
    static void init(){
        if(driver2 == null){
            driver2 = new ChromeDriver();
        }
    }

    @AfterMethod
    static void down_quit(){
        if(driver2!= null){
            driver2.quit();
            driver2=null;

        }
    }

    //Waits --> Thread.sleep , Implicit waits, Explicit wait

    public static void waitThread(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Implicit Waits

    public void Implicit_Waits(int time){
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    // Explicit waits

    public void explicit_wait(int time){
        
    }
    }
