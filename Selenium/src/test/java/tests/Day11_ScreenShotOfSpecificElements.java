package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class Day11_ScreenShotOfSpecificElements extends TestBase {

//    Acceptance Criteria:
//    When user goes to the application home page(techproeducation)
//    Then verify the logo of techpro education is displayed

    @Test
    public void test() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//*[@alt='Google']"));

        //verifying the logo
        assertTrue(googleLogo.isDisplayed());

        //getting the screenshot using reusable method
        takeScreenShotOfTheElement(googleLogo);
    }
}
