package com.revature.loggingdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
This is a javadoc
 */
public class Driver {
    private static final Logger logger = LoggerFactory.getLogger(Driver.class);

    public static void main(String[] args) {
        logger.trace("Trace log message");
        logger.debug("Debug log message");
        logger.info("Example log from {}", Driver.class.getSimpleName());
        logger.warn("Warn log message");
        logger.error("Error log message");

    }

}
