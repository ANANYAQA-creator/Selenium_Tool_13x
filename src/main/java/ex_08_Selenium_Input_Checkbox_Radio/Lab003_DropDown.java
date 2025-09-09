package ex_08_Selenium_Input_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab003_DropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();


        // Find the select box

       WebElement Dropdown = driver.findElement(By.id("dropdown"));

        // We can use here Select class to select the Option 2
        Select dropdown_select = new Select(Dropdown);
        dropdown_select.selectByVisibleText("Option 2");

        // We can use here index option also to select the Option 1

        dropdown_select.selectByIndex(1);




    }
}
