package ex_15_Selenium_Data_Driven_Testing_ApachePOI;

import org.testng.annotations.Test;

public class DDT_Excel_ApachePOI_test {


    @Test (dataProvider = "getData", dataProviderClass = Util_Excel.class)
    public void test_login_VWO (String email, String password){
        System.out.println("User_email:- " + email);
        System.out.println("User_Password :- " + password);

    }
}
