package ex05_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab01_Selenium_WebTables_Static_Table {


    @Description("Selenium Webtables")
    @Test(groups = "QA")

    public void Selenium_HTML() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        /* xpath Helen :- //table[@id="customers"]/tbody//tr[5]/td[2]
         1 Part :-//table[@id="customers"]/tbody//tr[
         2 Part:- i  consider i=5
         3 Part :- ]/td[
         4 Part :- j ]  consider j = 2



*/

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String seocnd_part = "]/td[";
        String third_part = "]";

        // Find the row size(total number of rows)  :- xpath - //table[@id="customers"]/tbody//tr
        // Find the coolumn size( number of columns) :- xpath - //table[@id="customers"]/tbody/tr[2]/td
        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//tr")).size();
        int column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(column);

        //Using For loop

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= column; j++) {

                String dynamic_path = first_part + i + seocnd_part + j + third_part;
                //  System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
              //  System.out.println(data);

                // For Helen bennet :- //table[@id="customers"]/tbody/tr[5]/td[2]
                // following-sibling of Helen Bennet :- //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td

                if (data.contains("Helen Bennett")) {
                    String country_Path = dynamic_path +"/following-sibling::td";
                    System.out.println(country_Path); // //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td
                    String country_text = driver.findElement(By.xpath(country_Path)).getText();
                    System.out.println("Helen Bennett is present in "+ country_text); //UK
                }

            }
        }
    }
}
