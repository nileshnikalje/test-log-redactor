Steps to build the project
1. Assemble the project using "mvn assembly:assembly"

Steps to reproduce the issue. 
Execute the following commands
1. cd target

2. Try running the main class by executing "java -cp .:./tesl4j-1.0-jar-with-dependencies.jar com.main.App"

3. The output should be displayed as

2018-05-08 11:49:32,583 [main] DEBUG com.test.example.LogMessage1 - From pkg1.LogMessage1 : Mask PASSWORD(ABCD)
2018-05-08 11:49:32,584 [main] DEBUG org.test.example.LogMessage2 - From pkg2.LogMessage2 : Mask PASSWORD(ABCD)

4. The password ABCD is not masked.

5. Edit the log4j.properties file and uncomment the line number 10 to apply the redactor appenders MASK_PASSWORDS_CONSOLE and MASK_PASSWORDS_FILE to the package com.test.example

log4j.logger.com.test.example=DEBUG, MASK_PASSWORDS_CONSOLE, MASK_PASSWORDS_FILE

6. Save the file and run the main class again by executing "java -cp .:./testl4j.jar com.main.App"

7. The password is now masked but for both the packages when we have specified it for just one. 
