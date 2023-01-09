package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_Log4J2 {
//      Create object be careful import to log4J library
    private static Logger logger = LogManager.getLogger(Day15_Log4J2.class.getName());

    @Test
    public void log4jTest(){
        logger.fatal("Fatal log!!!");
        logger.error("Error log");
        logger.warn("warning");
        logger.debug("debug");
        logger.info("info");
        logger.trace("trace");

    }
}
