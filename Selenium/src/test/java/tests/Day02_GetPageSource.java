package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {
    public static void main(String[] args) {
        //getPageSource() returns page source code as a string
        //We might use this to verify if a certain text exist in the entire page
        //Note that pageSource is not used a lot to do assertions
        //Because it is too general and can lead false result

 /*       TEST CASE:
        Test if amazon contains “Registry” on the homepage
        Create a new class : GetPageSource
  */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Test if amazon contains “Registry” on the homepage
        driver.get("http://www.amazon.com");
        String actualData = driver.getPageSource();
        String expectedWord = "Registry";

        if (actualData.contains(expectedWord)){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
            System.out.println("PAGE SOURCE : "+actualData);
            System.out.println("EXPECTED WORD : "+expectedWord);
        }
        driver.quit();



    }
}
