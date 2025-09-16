package ex_18_Selenium_DDT_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab01_Selenium_DDT {

    @Test (dataProvider = "getData")
    public void login_vwo (String username , String password, String ER) {

        WebDriver driver = new ChromeDriver();
        System.out.println("Running");
        System.out.println( username + "| | " + password + " | |" + ER);

      //  driver.get("https://app.vwo.com/#/login");
      //  driver.manage().window().maximize();

    }
        // Excel data will be present in 2d file in rows and column form.

    @DataProvider
        public Object [][] getData(){
        return new Object[][] {
                new Object[] {"admin1@gmail.com","pass1" , "Expected Result 1"},
                new Object[] {"admin2@gmail.com", "pass2",  "Expected Result 2"},
                new Object[] {"admin3#gmail.com" , "pass3" , "Expected Result 3"}
        };
        }



}
