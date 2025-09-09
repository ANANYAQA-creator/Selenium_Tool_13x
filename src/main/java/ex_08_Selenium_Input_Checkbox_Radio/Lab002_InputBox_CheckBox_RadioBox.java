package ex_08_Selenium_Input_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab002_InputBox_CheckBox_RadioBox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        // Input box :-

        // FirstName = //input[@name="firstname"]
        // LastName =  //input[@name="lastname"]

        WebElement first_name = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        first_name.sendKeys("ANANYA");

        WebElement last_name = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        last_name.sendKeys("RAWTE");

        // Radio button :-
        // Gender =  //input[@id="sex-0"]
        //YEO  = //input[@id="exp-2"]

        WebElement Gender = driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
        Gender.click();

        WebElement YEO = driver.findElement(By.xpath("//input[@id=\"exp-2\"]"));
        YEO.click();

        // CheckBox
        // Profession = //input[@id="profession-1"]
        //Automation tool = //input[@id="tool-2"]

        WebElement Profession = driver.findElement(By.id("profession-1"));
        Profession.click();

        WebElement Automation_Tool = driver.findElement(By.id("tool-2"));
        Automation_Tool.click();


    }
}
