package tests;

import org.junit.Test;
import utilities.TestBase;

public class Day06_TestBaseDemo extends TestBase {

    @Test
    public void test1(){
        driver.get("https://testcenter.techproeducation.com/");
        System.out.println(driver.getTitle());

    }
    @Test
    public void test2(){
        driver.get("https://www.techproeducation.com/");
        System.out.println(driver.getTitle());
    }
}
