package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class Day10_AutoComplete extends TestBase {

    @Test
    public void autoComplete(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        driver.findElement(By.id("myCountry")).sendKeys("uni");

        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();

        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        boolean result = driver.findElement(By.id("result")).getText().contains("United Kingdom");

        assertTrue(result);

    }

    @Test
    public void autoCompleteDynamicMethod(){
        searchAndSelectFromList("uni","United Kingdom");
    }
}
