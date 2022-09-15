package main.java.cor;

import java.util.logging.*;

public class Chain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Chain.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println("LogRecord обработан");
                flush();
            }
        };
        logger.addHandler(consoleHandler);
        logger.info("test");
    }
}