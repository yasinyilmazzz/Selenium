package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {

    @Test
    public void assertions() {
        /*
            What is assertion in testing?
            Assertion is done to check if expected result is equal to actual result.
            -expected == actual -> pass
            -expected != actual -> fail
            ------------------
            assertEquals("expected","actual");
            assertTrue(true); -> pass
            assertTrue(false); -> fail
            assertFalse(false); -> pass
            assertFalse(true); -> fail
            --------------------
         */

        Assert.assertEquals(5, 5);//FAIL
        if ("Java".contains("apple")) {//FAIL
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        Assert.assertEquals("java", "java");//PASS
        Assert.assertEquals("java".contains("j"), true);//PASS
//        --------------------
        Assert.assertTrue("java".contains("j"));//PASS
//        --------------------
        Assert.assertFalse("Java".contains("j"));//PASS (uppercasse-lowercase)

//        TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS. THIS IS CALLED HARD ASSERTIONS
//        TEST EXECUTION CONTINUES EVEN IF TEST VERIFICATION FAILS. VERIFICATION MEANS LIKE IF STATEMENT
//        What is difference between Assertion and Verification?
//        Assertion stops after assertion fails. Verification continues even after verification fails
//        Junit assertions are hard assertion. If statement is verification
//        NOTE: TestNG has soft assertion as well. We will learn it in TestNG
                /*

        What is the difference between Assertion and Verification?
        Assertion stops the execution in failure. Verification continues even after failure.
        JUnit assertions are hard assertions. If statement is verification.

        Hard Assertion : If the execution stops in failure it is call Hard Assertion
        Verification : If the execution continues in failure it is call Verification.

         */
    }
}
