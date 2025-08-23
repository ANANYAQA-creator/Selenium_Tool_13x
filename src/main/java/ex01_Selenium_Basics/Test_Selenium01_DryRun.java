package ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium01_DryRun {

    @Test
    public void test_Code(){
        Assert.assertEquals("Shivam","Shivam");
    }
    @Test
    public void test_OpenWebsite() {
        FirefoxDriver firefoxDriver= new FirefoxDriver();
        firefoxDriver.get("https://thetestingacademy.com");
        firefoxDriver.close();
    }
}
