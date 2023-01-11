package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.est.LimitedSource;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.sql.SQLOutput;
import java.util.List;

public class Day12_WebTables extends TestBase {
    private static Logger logger= LogManager.getLogger(Day12_WebTables.class.getName());
//    https://the-internet.herokuapp.com/tables
//    Create a class: WebTables
//    Task 1 : Print the entire table
//    Task 2 : Print All Rows
//    Task 3 : Print Last row data only
//    Task 4 : Print column 5 data in the table body
//    Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3);  => prints data in 2nd row 3rd column

    @Test
    public void printTable() {

        driver.get("https://the-internet.herokuapp.com/tables");

//    Task 1 : Print the entire table
        logger.info("Going to home page");
        String entireTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);
        List<WebElement> eachElement = driver.findElements(By.xpath("//table[@id='table1']//td"));
        eachElement.stream().forEach(t -> System.out.println(t.getText()));

//    Task 2 : Print All Rows

        logger.info("Printing all rows by using loop");
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum = 1;
        for (WebElement eachRow : allRows) {
            System.out.println("Row " + rowNum + " => " + eachRow.getText());
            rowNum++;
        }

//    Task 3 : Print Last row data only
        System.out.println("4th Row Data: " + allRows.get(4).getText());
        System.out.println("Last Row Data: " + allRows.get(allRows.size() - 1).getText());

//    Task 4 : Print column 5 data in the table body
        logger.info("print specific cell");
        List<WebElement> col5Data = driver.findElements(By.xpath("//table[@id='table1']//td[5]"));
        col5Data.stream().forEach(t-> System.out.println(t.getText()));

//        HOMEWORK
//        Task 5 : Write a method that accepts 2 parameters
//        Parameter 1 = row number
//        Parameter 2 = column number
//        printData(2,3);  => prints data in 2nd row 3rd column

        System.out.println("=========");
        printData(4,1);//Conway


    }

    public void printData(int rowNum, int colNum){
        String xpath = "//table[@id='table1']//tr["+rowNum+"]//td["+colNum+"]";
        System.out.println(driver.findElement(By.xpath(xpath)).getText());

    }
}
