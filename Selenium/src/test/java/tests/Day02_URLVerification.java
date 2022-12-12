package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_URLVerification {
    /*
    	1.Create a new class: VerifyURLTest
        2.Navigate to TechProEducation homepage
        3.Verify if Amazon homepage url is “https://www.amazon.com”
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //Verify actualData
        String expectedData = "https://www.amazon.com/";
        String actualData = driver.getCurrentUrl();

        if (actualData.equals(expectedData)) {
            System.out.println("Pass");
        } else {
            System.out.println("Test Fail");
        }
        driver.quit();

        /*
        Manual testing to verify page title:
        go to title --> right click--> inspect --> scroll down--> find <title> --> take screenshot
         */

                /*
        ===========Approach for Automation========

        1) I read the acceptance criteria very very carefully
        2) I then create my test case
        3) Then I do "Manual Testing" FIRST helps us to undrestand THE APPLICATION
        4) If all above good, I start complete my automation script
        4) If I find any bug/defect, then I talk to dev. Dev fixes the issue, then I reset.If all is good then start my AUTOMATION
        5) when Automation is complete, I prepare the report for the user story. In fact, My Automation script generate html
        reports for us, I upload those reports to the JIRA.
        for my MANUAL test cases, I manually take screenshots and prepare reports and attach them to the JIRA.
-----------------------------------------------------------------------------------------------------------------
        WHAT DO YOU DO WHEN YOUR TEST CASE PASS?
        -Prepare report and upload to JIRA
------------------------------------------------------------
        WHAT DO YOU DO WHEN YOUR TEST CASE FAIL OR WHEN YOU FIND A BUG?
        -Retest to make sure from the failure.It can be data issue, typo, documentation issue or is can be a real bug.
        -If that is a bug, then talk to the dev and let them fix the bug.
        -After the fix, we retest. when test cases passes we upload to JIRA
------------------------------------------------
        * */


    }
}
