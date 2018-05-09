package org.cloudera;

import org.apache.log4j.Logger;

public class LogMessage1 {
    final static Logger log4jLogger =
            Logger.getLogger(LogMessage1.class.getName());
    public void logMessage() {
        log4jLogger.debug("From package org.cloudera : Mask PASSWORD(ABCD)");

    }
}
