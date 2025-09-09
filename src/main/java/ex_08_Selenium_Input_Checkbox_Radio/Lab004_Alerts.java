package ex_08_Selenium_Input_Checkbox_Radio;


import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab004_Alerts {

    @Test
    public void test_alerts (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        // Xpath
        //JS alert = //button[normalize-space()="Click for JS Alert"]   or   //button[@onclick="jsAlert()"]
        // JS confirm = //button[normalize-space()="Click for JS Confirm"]   or  //button[@onclick="jsConfirm()"]
        // JS Prompt = //button[normalize-space()="Click for JS Prompt"]
        // Result :- //p[@id="result"]    or   //p[normalize-space()="You successfully clicked an alert"]

        //JS alert = //button[normalize-space()="Click for JS Alert"]   or   //button[@onclick="jsAlert()"]
/*
      WebElement JS_alert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        JS_alert.click();

        WebDriverWait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        explicit_wait.until(ExpectedConditions.alertIsPresent());

        Alert  OK_Alert_click =  driver.switchTo().alert();
        OK_Alert_click.accept();

       String result = driver.findElement(By.id("result")).getText();
       Assert.assertEquals(result,"You successfully clicked an alert");

*/

/*

        // JS confirm = //button[normalize-space()="Click for JS Confirm"]  or  //button[@onclick="jsConfirm()"]

        WebElement js_confirm_click = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        js_confirm_click.click();

        WebDriverWait explicit_wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        explicit_wait.until(ExpectedConditions.alertIsPresent());

       // for accept   means OK
        Alert JS_confirm_accept_alert = driver.switchTo().alert();
        JS_confirm_accept_alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You clicked: Ok");


        // for dismiss - means cancel

        Alert js_confirm_dismis_alert = driver.switchTo().alert();
        js_confirm_dismis_alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You clicked: Cancel");
*/


        // JS Prompt = //button[normalize-space()="Click for JS Prompt"]  or  //button[@onclick="jsPrompt()"]   or button[onclick='jsPrompt()'] - CSS selector

        WebElement Js_prompt_click = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        Js_prompt_click.click();

        WebDriverWait explicit_wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        explicit_wait.until(ExpectedConditions.alertIsPresent());

        Alert prompt_alert = driver.switchTo().alert();
        String name = "ANANYA";
        prompt_alert.sendKeys(name);
        prompt_alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: " +name);


       // WebElement Js_prompt_click1 = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
      //  Js_prompt_click1.click();






    //    driver.close();

    }
}
