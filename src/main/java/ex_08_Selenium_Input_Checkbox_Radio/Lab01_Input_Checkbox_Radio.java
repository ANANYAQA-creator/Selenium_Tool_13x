package ex_08_Selenium_Input_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01_Input_Checkbox_Radio {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Shivani");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Rawte");


        WebElement female_click = driver.findElement(By.id("sex-1"));
        female_click.click();

        WebElement AT_click = driver.findElement(By.id("profession-1"));
        AT_click.click();

    }
}
