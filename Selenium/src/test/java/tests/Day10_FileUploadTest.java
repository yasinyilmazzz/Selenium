package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Day10_FileUploadTest extends TestBase {
//    Class Name: FileUploadTest
//    Method Name: fileUploadTest
//    When user goes to https://the-internet.herokuapp.com/upload
//    When user selects an image from the desktop
//    And click on the upload button
//    Then verify the File Uploaded!  Message displayed

    @Test
    public void fileUploadTest() {

        driver.get("https://the-internet.herokuapp.com/upload");

//        1. locate choose file and click choose a file
//        <input type="file">
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

//        2. select a file from your computer
        String userHome = System.getProperty("user.home");
        String pathOfFile = userHome + "/Desktop/DxDiag.txt";

//        Sending the path of the file that I want to upload.
//        we can use send keys cause the input type file combination
        chooseFile.sendKeys(pathOfFile);

//        3. then locate and click upload
        driver.findElement(By.id("file-submit")).click();

//    Then verify the File Uploaded!  Message displayed
        boolean isExist = driver.findElement(By.xpath("//h3")).getText().equals("File Uploaded!");
        assertTrue(isExist);

        //Firstly you locate the choose file button and if there is input type file combination,
        // you would first type the path of file dynamicly and with the help of sendKeys()
        // you send the path of file and then locate and click the submit / upload button

    /*
    How do you upload a file with selenium?
    -First selenium has limitation automation of files. But file upload can be done with selenium.
    We locate the chose file button and use send keys function to send the path of the file.
    Then we click upload button to upload the file.
    Path of the file should be dynamic - use System.getProperty("user.home");

    LIMITATION:
        Selenium has limitation automation DESKTOP APPS
        For example, we can not find path of files, or verify if file exists on out machines with selenum
        Instead we use java File libraries
     */

    }

    @Test
    public void exercise() {
        //      When user goes http://webdriveruniversity.com/File-Upload/index.html
        driver.get("http://webdriveruniversity.com/File-Upload/index.html");

        //      Locate the upload box and define the path of our file
        String userHome = System.getProperty("user.home");
        driver.findElement(By.id("myFile")).sendKeys(userHome + "/Desktop/DxDiag.txt");

        //      Click on the 'Submit' button.
        driver.findElement(By.id("submit-button")).click();

        //      Switch to alert
        String alertMessage = driver.switchTo().alert().getText();

        //      Verify the file is uploaded
        assertEquals("Your file has now been uploaded!", alertMessage);

        //      accept the alert
        driver.switchTo().alert().accept();
    }


}
