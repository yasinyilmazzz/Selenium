package practices.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class EbayGettingTitleOfPhotos extends TestBase {

    @Test
    public void testEbay() throws InterruptedException {
        // Go to ebay.com
        driver.get("https://www.ebay.com/");

        // Click Electronics
        WebElement element = driver.findElement(By.linkText("Electronics"));
        element.click();

        // Find photos with width = 225 and height = 225
        // Iterate through photos and print the title of the page
        for (int i = 0; i < 24; i++) {
            List<WebElement> photos = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
            photos.get(i).click();
            System.out.println(driver.getTitle());
            Thread.sleep(1000);
            driver.navigate().back();
        }
    }

}
