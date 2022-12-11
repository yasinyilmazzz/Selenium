import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {

        //1. Set up Chrome Driver
        //  chrome : webdriver.chrome.driver
        //  firefox: gecko
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");

        //2. Create Chrome Driver
        WebDriver driver = new ChromeDriver();

        //3.Now that created web Driver, we can automate web application
        driver.get("https://www.amazon.com");



    }
}
