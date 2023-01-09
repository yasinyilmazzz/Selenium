package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_LogTests {
    private static Logger logger = LogManager.getLogger(Day15_LogTests.class.getName());
    @Test
    public void test1(){
        logger.fatal("Fatal log!!!");
        logger.error("Error log");
        logger.warn("warning");
        logger.debug("debug");
        logger.info("info");
        logger.trace("trace");

    }
}
