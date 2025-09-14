package ex_15_Selenium_Data_Driven_Testing_ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Util_Excel {

    // Apache POI --> Read the file --> WorkBook create --> Sheet ---> Row and Cell --> 2D Object

    static Workbook workbook;
    static Sheet sheet;


    public static String Sheet_Path = System.getProperty("user.dir")+ "/src/main/java/Resource_Folder/LoginnVWO_TestData_POI1.xlsx";

    public static Object [][]  getTestDataFromExcel (String Sheetname) throws IOException {

        FileInputStream file = null;
        try {
            file = new FileInputStream(Sheet_Path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        workbook = WorkbookFactory.create(file);
        sheet = workbook.getSheet(Sheetname);

        Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // Matrix 101 *2

        for (int i = 0; i <sheet.getLastRowNum() ; i++) {
            for (int j = 0; j <sheet.getRow(0).getLastCellNum() ; j++) {

                data[i][j] = sheet.getRow(i+1).getCell(j).toString() ;
            }
        }
        return data;
    }
     //  public static Object [][] getTestDataFromSQL(String Sheetname){
     //        return null;
     //  }

    @DataProvider (name = "getData")
    public static Object [][] getData() {
        try {
            return  getTestDataFromExcel("data");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
