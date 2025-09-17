package ex_18_Selenium_DDT_New;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UtilExcel2  {

    public static  String Sheet_path =  System.getProperty("user.dir") + "/src/main/java/Resource_Folder/LoginnVWO_TestData_POI2.xlsx";
    //System.getProperty("user.dir") ==  C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium13x


    static Workbook wb;
    static Sheet sheet;



    public static Object[][] getDataFromExcel(String Sheetname1){

        // Using APACHE POI
        // Read the Testdata.xlsx from excel file.
        // Workbook create
        // Sheet
        // Row and Column/Cell
        // 2D object - get Data


        FileInputStream fileInputStream = null;
        try{

            fileInputStream  = new FileInputStream(Sheet_path);

            wb = WorkbookFactory.create(fileInputStream);
            sheet = wb.getSheet(Sheetname1);
        }catch (IOException e){
            System.out.println("File not found !! ");
        }


        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i=0; i<sheet.getLastRowNum(); i++){
            for (int j=0; j<sheet.getRow(0).getLastCellNum(); j++ ){

                //First row email,passowrd --> Column name (Skip header)

                data [i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;

    }
}
