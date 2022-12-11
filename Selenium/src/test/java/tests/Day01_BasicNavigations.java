package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    /*
    Test Steps:
        Create a new class under : BasicNavigations
        Create main method
        Set Path
        Create chrome driver
        Maximize the window
        Open google home page https://www.walmart.com/.
        On the same class, Navigate to amazon home page https://www.amazon.com/
        Navigate back to google
        Navigate forward to amazon
        Refresh the page
        Close/Quit the browser
     */
    public static void main(String[] args) {
        //1. set up
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");

        //2. Create chrome driver
        WebDriver driver = new ChromeDriver();

        //3. Write Test scripts
            //        Maximize the window
        driver.manage().window().maximize();

            //        Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");

            //        On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

            //        Navigate back to walmart
        driver.navigate().back();
            //        Navigate forward to amazon
        driver.navigate().forward();
            //        Refresh the page
        driver.navigate().refresh();
            //        Close/Quit the browser
        //in there you have 2 option
        //driver.close();               //==> close just close current window only
        driver.quit();                  //quit close browser that opened with releated execute

    }
}
