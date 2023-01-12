package practices.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {

    // ...Practice 1...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Navigate to techproeducation home page https://techproeducation.com/
    // Navigate back to google
    // Navigate forward to techproeducation
    // Refresh the page
    // Close/Quit the browser
    // And last step : print "ALL OK" on console

    public static void main(String[] args) {
        // ...Practice 1...
        // Set Driver Path
        System.setProperty("webdriver.driver.chrome","src/resources/drivers/chromedriver.exe");
        // Create chrome driver object
        WebDriver driver = new ChromeDriver();
        // Maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        // Open google home page https://www.google.com/
        driver.get("https://www.google.com");
        // Navigate to amazon home page https://amazon.com/
        driver.navigate().to("https://amazon.com/");
        // Navigate back to google
        driver.navigate().back();
        // Navigate forward to amazon
        driver.navigate().forward();
        // Refresh the page
        driver.navigate().refresh();
        // Close/Quit the browser
        driver.quit();
        // And last step : print "ALL OK" on console
        System.out.println("ALL OK");
    }


}
