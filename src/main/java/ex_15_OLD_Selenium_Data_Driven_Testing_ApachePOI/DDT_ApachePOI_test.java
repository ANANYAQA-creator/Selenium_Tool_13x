package ex_15_OLD_Selenium_Data_Driven_Testing_ApachePOI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_ApachePOI_test {


    @DataProvider
    public Object[][] getdata() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass1"},
                new Object[]{"Admin123@gmail.com", "Pass2"},
                        new Object[]{"Admin2@gmail.com", "Pass3"}

        };
    }
    /*
    // Read the data from Excel and give result as 2D object
    @DataProvider
    public Object[][] getData1 () {
    }
    */
        @Test(dataProvider = "getdata")
        public void login_test (String email, String password){
            System.out.println(email + "|" + password);
        }
    }