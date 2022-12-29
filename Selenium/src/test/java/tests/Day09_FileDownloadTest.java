package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileDownloadTest extends TestBase {
    @Test
    public void fileDownload() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        driver.findElement(By.linkText("b10 all test cases, code.docx")).click();
        Thread.sleep(4000);
        String homeDirectory = System.getProperty("user.home");
        String filePath = "D:\\Downloads\\b10 all test cases, code.docx";

        boolean isDownloaded = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownloaded);

    }
}
