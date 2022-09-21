package Utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static Workbook wbook;
    static Sheet sheet;

    // method to open excel files
    public static void openExcel(String filePath){
        try{
            FileInputStream fis = new FileInputStream(filePath);
            wbook = new XSSFWorkbook(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // open the sheet in excel file:
    public static void getSheet(String sheetName) {
        sheet = wbook.getSheet(sheetName);
    }

    // count total number of rows in a worksheet
    public static int getRowCount(){ return sheet.getPhysicalNumberOfRows();}

    //count total number of columns in worksheet
    public static int getColumnCount(int rowIndex){
        return sheet.getRow(rowIndex).getPhysicalNumberOfCells();
    }

    // get data from cells:
    public static String getCellData(int rowIndex, int colIndex){
        return sheet.getRow(rowIndex).getCell(colIndex).toString();
    }


}
