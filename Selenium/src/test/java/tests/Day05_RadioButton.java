package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Day05_RadioButton {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
    }
    @Test
    public void radioTest(){
        /*
        https://testcenter.techproeducation.com/index.php?page=radio-buttons
        Click on Red
        Click on Football
         */

//        select red
        WebElement redOption = driver.findElement(By.id("red"));
        redOption.click();
        Assert.assertTrue(redOption.isSelected());//Verifying teh red radio button is selected
//        select football
        WebElement footballOption = driver.findElement(By.id("football"));
        footballOption.click();
        Assert.assertTrue(footballOption.isSelected());//Verifying the football option is selected
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
