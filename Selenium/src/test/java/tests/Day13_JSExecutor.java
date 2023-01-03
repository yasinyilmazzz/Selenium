package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Day13_JSExecutor extends TestBase {

//    When user goes to home page
//    And scroll on the "Practice with our Online Compilers" element
//    And scroll on the search box element

    @Test
    public void test(){
        driver.get("https://www.programiz.com/");

//        1. create js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

//        2. execute the command
        waitFor(2);
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[.='Practice with our Online Compilers']")));

        waitFor(2);
        scrollIntoViewJS(driver.findElement(By.xpath("//*[.='Company']")));

        waitFor(2);
        scrollAllUpByJS();

        waitFor(2);
        scrollAllDownByJS();

    }
    /*
    click on an element
    @param WebElement
    Normally we use element.click() method in selenium
    When there is an issue with click()-hidden, different UI, ...
    Then we can use javascript click that works better
     */
    @Test
    public void clickByJSTest(){
        driver.get("https://techproeducation.com/");
//        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
//        clickByJS(lmsLogin);
        clickByJS(driver.findElement(By.linkText("LMS LOGIN")));
    }

    @Test
    public void typeInTheInput(){
        driver.get("https://techproeducation.com/");
        setValueByJS(driver.findElement(By.xpath("//input[@type='search']")), "QA");
    }

    @Test
    public void getValueOfInputTest(){

        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");

    }

    @Test
    public void colorByJSTest(){
        driver.get("https://www.priceline.com/");
        changeBackgroundColorByJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"yellow");
        addBorderWithJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"5px solid green");
    }

}
