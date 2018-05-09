package org.example;

import org.apache.log4j.Logger;

public class LogMessage2 {
    private Logger log4jLogger =
            Logger.getLogger(LogMessage2.class.getName());
    public void logMessage() {
        log4jLogger.debug("From package org.example : Mask PASSWORD(ABCD)");

    }
}
