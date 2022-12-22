package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Day07_WindowHandle1 extends TestBase {

//    Create a new Class Tests package: WindowHandleExample
//    Method name:windowHandle
//    Given user is on the https://the-internet.herokuapp.com/windows
//    Then user verifies the text : “Opening a new window”
//    Then user verifies the title of the page is “The Internet”
//    When user clicks on the “Click Here” button
//    Then user verifies the new window title is “New Window”
//    Then user verifies the text:  “New Window”
//    When user goes back to the previous window and then verifies the title : “The Internet”

    @Test
    public void windowHandleTest(){
//        Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows ");

//        Then user verifies the text : “Opening a new window”
        String window1Text = driver.findElement(By.xpath("//h3")).getText();
        assertEquals("Opening a new window",window1Text);

//        Then user verifies the title of the page is “The Internet”
        String window1Title = driver.getTitle();
        assertEquals("The Internet", window1Title);

//        When user clicks on the “Click Here” button
        driver.findElement(By.linkText("Click Here")).click();

        String window1Handle = driver.getWindowHandle();

//        Then user verifies the new window title is “New Window”
        Set<String> allWindowHandles =  driver.getWindowHandles();

        for (String w : allWindowHandles){
            if (!w.equals(window1Handle)) driver.switchTo().window(w);
        }

//        Then user verifies the text:  “New Window”
        String newWindow = driver.findElement(By.xpath("//h3")).getText();
        assertEquals("New Window",newWindow);
//        When user goes back to the previous window and then verifies the title : “The Internet”
        driver.switchTo().window(window1Handle);
    }

}
