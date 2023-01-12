package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day14_TimeOutException extends TestBase {
    @Test
    public void timeOutTest() {
        driver.get("https://techproeducation.com/");
        waitForVisibility(By.id("wrong-id"), 15);
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

//  ========================= ************************ ======================
    /*
    Tell me 5 exception that you get/What type of exceptions do you get in selenium?
    Null pointer, no such element, time out, slate element reference, web driver
    What is your solution?
    Read the error message and learn what is the error and where it is.
    In general, error happens because of the timing issue, wrong locator, or iframe/windows/alerts
    Each error has specific solutions but in general, I debug my code, and do some research then execute the code one more time after the fix.
    What type of waits do you use?
    I use implicit or explicit wait
    Which wait do you prefer?
    Explicit wait works better in some cases. When I use explicit wait, and still see timeout exception, then then there can be other issues such as incorrect locators.
    Why do you prefer that wait?
    I already have implicit wait in my Driver class, but I prefer explicit wait when I need to use an expected condition such as element is not visible.
    How do you resolve synronization issue?
    I use implicit or explicit wait. In my driver class, I already have implicit wait, that handles most of the wait issues, but when it is not enough than I use explicit wait.
     */
}
