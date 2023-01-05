package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Day14_NullPointerException {

    //    DECLARED BUT NEVER INSTANTIALTED
    WebDriver driver;
    Faker faker;

    @Test
    public void nullPointerTest(){
        driver.get("https://techproeducation.com/");//NullPointerException
    }

    @Test
    public void nullPointerTest1(){
        System.out.println(faker.name().fullName());//NullPointerException
    }
    /*
    NullPointerException
        When a variable is created, but not instantiated,
        when pointer does not show any value then we get NullPointerException.
        It is common to for to initialize the Driver, they we get
        the exaction. Driver driver; but never use driver=new ChromeDriver()
        For example, in my page object model, I create
        page objects in test classes but when I forgot to use
        new keyword to instantiate, then I get the exception
    Solution:
        Instantiate the variable
     */

}
