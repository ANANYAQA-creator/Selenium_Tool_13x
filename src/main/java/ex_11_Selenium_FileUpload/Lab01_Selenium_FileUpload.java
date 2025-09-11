package ex_11_Selenium_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab01_Selenium_FileUpload {

    @Test

    public void fileupload (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        // Using FileUpload for testdata.txt

        WebElement fileUpload = driver.findElement(By.id("fileToUpload"));
       // String user_Directory = System.getProperty("user.dir");

        //C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium13x\    --> User Directory Path
        // \src\main\java\ex_11_Selenium_FileUpload\testdata.txt    --> Complete Path

        // String path = user_Directory +"\\src\\main\\java\\ex_11_Selenium_FileUpload\\testdata.txt";
       // String full_Path1 = "C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium13x\src\main\java\ex_11_Selenium_FileUpload\testdata.txt";

       // fileUpload.sendKeys(path);
      //  driver.findElement(By.name("submit")).click();


        // For Desktop file - For My Remainder.txt

        String desktop_file = "C:\\Users\\Black Panther\\Desktop\\For My Remainder.txt";
        fileUpload.sendKeys(desktop_file);
        driver.findElement(By.name("submit")).click();

    }
}
