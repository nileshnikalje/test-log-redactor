package org.main;

import org.cloudera.LogMessage1;
import org.example.LogMessage2;

public class App {
    public static void main(String[] args) {
        new LogMessage1().logMessage();
        new LogMessage2().logMessage();
    }
}
