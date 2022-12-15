package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Day05_dynamic_xpath {
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void dynamicXpath(){

//        Verify if "Username : Admin" is text is displayed on the page
        WebElement userNameText = driver.findElement(By.xpath("//*[.='Username : Admin']"));
        assertTrue(userNameText.isDisplayed());

//        Verify if "Password : admin123" text is displayed on the page
        WebElement passwordText = driver.findElement(By.xpath("//*[.='Password : admin123']"));
        assertTrue(passwordText.isDisplayed());

//        2. XPATH = //[(text()='TEXT OF THE ELEMENT')]
        WebElement userNameText1 = driver.findElement(By.xpath("//*[(text()='Username : Admin')]"));
        Assert.assertTrue(userNameText1.isDisplayed());

//        Verify if "Password" text is displayed on the page
//        3. XPATH = //*[contains(text(),'PARTIAL OR FULL TEXT OF THE ELEMENT');
        WebElement passwordText1 = driver.findElement(By.xpath("//*[contains(text(),'Passw')]"));
        Assert.assertTrue(passwordText1.isDisplayed());
    }
}
