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

public class Day03_CheckBox {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
    }

    @Test
    public void checkBoxTest(){
//Locationg checkbox 1 and checkbox2
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));

//        Click on the checkbox 1 if it is NOT already selected
        if (!checkbox1.isSelected()) checkbox1.click(); //isSelected() returns true id checkbox is checked, returns false if checkbox is not checked
//        Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected()) checkbox2.click();
//        Then verify that checkbox1 is checked.
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());
    }

    @After
    public void tierDown(){
        driver.quit();
    }
}
