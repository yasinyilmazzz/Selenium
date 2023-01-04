package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day14_NoSuchElementException extends TestBase {

    /*
    *    NoSuchElementException
    *    TimeOutException
    *    NullPointerException
    *    InvalidSelectorException
    *    StaleElementReferenceException
    *    InvalidElementStateException
    *    WebDriverException
    *    ElementNotInteractableException
    *    ElementClickInterceptedException
    *    InvalidArgumentException
    *    JavascriptException
    *    RemoteDriverServerException
    */

    @Test
    public void noSuchElementTest(){
        driver.get("https://amazon.com/");

//        Wrong locator
        driver.findElement(By.id("wrong-id"));
    }
    /*
     NoSuchElementException:
-Locator is wrong
-Element is not on the page because of the iframe or pop up or new window
-Loading issue-syntonization issue
-Element is hidden

    Solution:
-Make sure locator is correct. Double check the syntax
-Do manual testing to make sure there is no iframe, popups, or any other blocked on the page
-If locator is correct and if we used correct switch(iframe, new window,…) then apply wait.
    Maybe element is hidden or loading slower.
-Sometimes Implicit wait may not be enough to handle specific issues. For example,
    when we test reservation functionality, after clicking save button,
    we had to put explicit wait to verify the success message on the popup window.
-Try using explicit wait. It that doesn’t work, then try thread.sleep as a last resort
     */


}
