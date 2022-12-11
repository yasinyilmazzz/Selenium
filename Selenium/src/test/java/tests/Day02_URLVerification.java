package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_URLVerification {
    /*
    	1.Create a new class: VerifyURLTest
        2.Navigate to TechProEducation homepage
        3.Verify if Amazon homepage url is “https://www.amazon.com”
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //Verify actualData
        String expectedData ="https://www.amazon.com/";
        String actualData = driver.getCurrentUrl();

        if (actualData.equals(expectedData)){
            System.out.println("Pass");
        }else {
            System.out.println("Test Fail");
        }
        driver.quit();

        /*
        Manual testing to verify page title:
        go to title --> right click--> inspect --> scroll down--> find <title> --> take screenshot
         */



    }
}
