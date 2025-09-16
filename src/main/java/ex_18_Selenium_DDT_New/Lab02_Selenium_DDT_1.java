package ex_18_Selenium_DDT_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab02_Selenium_DDT_1 {

    @Test (dataProvider = "getData")
    public void login_vwo (String username , String password, String ER) {

      //  WebDriver driver = new ChromeDriver();
        System.out.println("Running");
        System.out.println( username + "| | " + password + " | |" + ER);
        System.out.println();

      //  driver.get("https://app.vwo.com/#/login");
      //  driver.manage().window().maximize();

    }

        // Excel data will be present in 2d file in rows and column form.

    @DataProvider
        public Object [][] getData(){
        // Read the data from the excel file
        // Convert the data in 2d format
        // return the array

        return null;
    }
}
