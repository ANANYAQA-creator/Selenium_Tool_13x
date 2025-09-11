package ex_11_Selenium_FileUpload;

import ex_07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab02_Selenium_BrowserStack {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();


        WebElement Business_Email = driver.findElement(By.id("user_email_login"));
        Business_Email.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement Email_Password = driver.findElement(By.id("user_password"));
        Email_Password.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement submit = driver.findElement(By.id("user_submit"));
        submit.click();

        new WaitHelpers().waitJVM(5000);

        driver.get("https://app-automate.browserstack.com/qig/framework");

        new WaitHelpers().waitJVM(2000);

        WebElement uploadFileInput = driver.findElement(By.id("file-upload"));
        String user_dir = System.getProperty("user.dir");
        // C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium13x
        System.out.println(user_dir);
        String path = user_dir+ "\\src\\main\\java\\ex_11_Selenium_FileUpload\\testdroid-sample-app.apk";

        uploadFileInput.sendKeys(path);


    }
}
