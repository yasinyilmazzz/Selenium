package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day14_TimeOutException extends TestBase {
    @Test
    public void timeOutTest(){
        driver.get("https://techproeducation.com/");
        waitForVisibility(By.id("wrong-id"),15);
    }
    /*
    TimeOutException:
        If you use explicit wait and wait time is not enough/locator still
        incorrect then TimeOutException
        Simply put, wait time is over but the commend is not completed

    Solution:
        -Increase the wait time
        -Try using different wait. For example try using javascript executor wait
        for the page to load. This is also a dynamic wait
        -I have different explicit waits in my Reusable util class. I have javascript
        executor wait as well. ReusableMethods.waitForPageToLoad(1);
        -Case by case, I prefer different explicit waits to maximize the
        performance of the automation script
         */
}
