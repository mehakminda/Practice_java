package com.test.designPattern.behaviour.chainofresponsibility;

public class LogDemo {
    static void main(String args[]) {

        System.out.println("###### Chain of Responsibility Design Pattern ######");

        LogProcessor logProcessor = getChainOfLoggers();

        System.out.println("Logging messages:");
        System.out.println("===== Logging DEBUG message =====");
        logProcessor.logMessage(LogProcessor.DEBUG, "This is a debug message");
        System.out.println("===== Logging INFO message =====");
        logProcessor.logMessage(LogProcessor.INFO, "This is an info message");
        System.out.println("===== Logging ERROR message =====");
        logProcessor.logMessage(LogProcessor.ERROR, "This is an error message");
        System.out.println("===== Logging FATAL message =====");
        logProcessor.logMessage(LogProcessor.FATAL, "This is a fatal message");


    }
    private static LogProcessor getChainOfLoggers(){
        LogProcessor fatalLogger = new FatalLogProcessor(LogProcessor.FATAL); //4
        LogProcessor errorLogger = new FatalLogProcessor(LogProcessor.ERROR); //3
        LogProcessor infoLogger = new FatalLogProcessor(LogProcessor.INFO); //2
        LogProcessor debugLogger = new FatalLogProcessor(LogProcessor.DEBUG); //1


        //Dynamic chaining : DEBUG -> INFO -> ERROR -> FATAL

        //chaining via setter
        debugLogger.setnextLogger(infoLogger);
        infoLogger.setnextLogger(errorLogger);
        errorLogger.setnextLogger(fatalLogger);
        fatalLogger.setnextLogger(null); //last logger in chain

        return debugLogger;  // Return the first LogProcessor in chain

    }
}
