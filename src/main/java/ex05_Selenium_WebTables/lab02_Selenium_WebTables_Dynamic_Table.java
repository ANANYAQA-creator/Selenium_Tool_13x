package ex05_Selenium_WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class lab02_Selenium_WebTables_Dynamic_Table {


    @Description ("Selenium_WebTable_Dynamic_Table")
    @Owner("ANANYA-QA")
    @Test(groups = "DynamicTable")

    public void Selenium_Dynamic_Webtable()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        //Find the xpath for dynamic table :- //table[@summary="Sample Table"]
        // xpath for Saudi Arabia :- //table[@summary="Sample Table"]/tbody/tr[2]/td[1]

      WebElement table = driver.findElement(xpath("//table[@summary=\"Sample Table\"]/tbody"));

    // Rows and Columns

       List<WebElement> row_table = table.findElements(By.tagName("tr"));

       for (int i=0 ; i<row_table.size(); i++) {
           List<WebElement> col_table = row_table.get(i).findElements(By.tagName("td"));

           for (WebElement c : col_table) {
               System.out.println(c.getText());
           }
       }




    }
}
