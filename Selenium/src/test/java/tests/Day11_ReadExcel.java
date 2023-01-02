package tests;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Day11_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
//        Import the apache poi dependency in your pom file
//        Create resources directory under java folder(right click on java and create the folder)
//        Add the excel file on the resources folder
//        Create a new package: excelautomation
//        Create a new class : ReadExcel
//        Create a new test method : readExcel()
//        Store the path of the  file in a string
        String path = "./src/test/java/resources/Capitals.xlsx";

//        Open the file
        FileInputStream fileInputStream = new FileInputStream(path);

//        Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet1 = workbook.getSheet("Sheet1");
        //workbook.getSheetAt(0) ======> Alternatively get by using index

//        Go to first row
        Row row1 = sheet1.getRow(0);

//        Go to first cell on that first row and print
        Cell cell1 = row1.getCell(0);
        //we can convert Cell to String
        String cell1Data = cell1.toString(); // Benefit of convert cell to string is you can use String methods
        System.out.println(cell1);

//        Go to second cell on that first row and print
        Cell r1c2 = row1.getCell(1);
        System.out.println(r1c2);
        // Short Way chaining the methods
        sheet1.getRow(0).getCell(1);

//        Go to 2nd row first cell  and assert if the data equal to USA
         String r2c1 = sheet1.getRow(1).getCell(0).toString();
         assertEquals("USA",r2c1);

//        Go to 3rd row 2nd cell-chain the row and cell
        sheet1.getRow(2).getCell(2);

//        Find the number of row
        int numberOfRow = sheet1.getLastRowNum()+1;
        System.out.println("numberOfRow = " + numberOfRow);
        //index starts at 0 and getLastRowNumber always return last row

//        Find the number of used row
        int numberOfUsedRows = sheet1.getPhysicalNumberOfRows();
        System.out.println("numberOfUsedRows = " + numberOfUsedRows);
        //index starts at 1 and getPhysicalNumberOfRows returns only number of used row. Not count Empty rows

//        Print country, capitol key value pairs as map object
        Map<String,String> countryCapitals = new HashMap<>();

        for (int i = 1; i < numberOfRow; i++) {//row index starts at 1, ends at 11
            String country = sheet1.getRow(i).getCell(0).toString();
            String capitals = sheet1.getRow(i).getCell(1).toString();
            countryCapitals.put(country,capitals);
        }
        System.out.println(countryCapitals);

    }
}
