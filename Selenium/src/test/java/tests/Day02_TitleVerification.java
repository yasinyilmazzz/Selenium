package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");



        //get the title
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle =  driver.getTitle();

        //Verify the response
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();

    }
}
