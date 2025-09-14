package ex_15_Selenium_Data_Driven_Testing_ApachePOI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_ApachePOI_test_Parallel {


    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getdata() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "Pass1"},
                new Object[]{"Admin123@gmail.com", "Pass2"},
                new Object[]{"Admin2@gmail.com", "Pass3"}

        };
    }

    @DataProvider(name= "LoginData2",parallel = true)
        public Object[][] getdata2() {
            return new Object[][]{
                    new Object[]{"shiv@gmail.com", "Pass1"},
                    new Object[]{"Adm123@gmail.com", "Pass2"},
                    new Object[]{"Admin322@gmail.com", "Pass3"}

            };
    }
    /*
    // Read the data from Excel and give result as 2D object
    @DataProvider
    public Object[][] getData1 () {
    }
    */

        @Test(dataProvider = "LoginData")
        public void login_test (String email, String password){
            System.out.println(email + "|" + password);
        }

    @Test(dataProvider = "LoginData2")
    public void login_test2 (String email, String password){
        System.out.println(email + "|" + password);
    }
}
