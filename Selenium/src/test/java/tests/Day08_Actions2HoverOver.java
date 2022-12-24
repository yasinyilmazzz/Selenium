package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Day08_Actions2HoverOver extends TestBase {
//        Create a class: Actions2
//        Create test method : hoverOver() and test the following scenario:
//        Given user is on the https://www.amazon.com/
//        When use click on “Account” link
//        Then verify the page title contains “Your Account”
    @Test
    public void hoverOvertest(){
//        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        When use click on “Account” link
        Actions actions = new Actions(driver);
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(accountList).perform();

        driver.findElement(By.linkText("Account")).click();
//        Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
//        DONE
    }

    /*======Question=======
        Given
                Go to https://testpages.herokuapp.com/styled/csspseudo/css-hover.html
        When
                Hover over "Hover Div"
        And
                Click on “Can you click me?” link.
        Then
                Verify the text "Action Complete".
        */
    @Test
    public void hoverOverQ(){
        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");
        WebElement hoverDiv = driver.findElement(By.id("hoverdivpara"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverDiv).perform();
        driver.findElement(By.linkText("Can you click me?")).click();
        WebElement afterClick = driver.findElement(By.xpath("//*[text()='Action Complete']"));
        assertTrue(afterClick.isDisplayed());
    }

}
