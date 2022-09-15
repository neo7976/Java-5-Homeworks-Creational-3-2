package main.java.cor.netology;

import java.util.Arrays;
import java.util.List;

public class Main {
    public interface Processor {
        boolean process(String msg);
    }

    static final List<Processor> PROCESSORS = Arrays.asList(
            (msg) -> {
                if (msg.startsWith("Hello")) {
                    System.out.println("Hi, customer!");
                    return true;
                }
                return false;
            },
            (msg) -> {
                if (msg.startsWith("Привет")) {
                    System.out.println("Здравствуй, клиент!");
                    return true;
                }
                return false;
            },
            (msg) -> {
                System.out.println("Админ, мы этого языка не знаем!");
                return true;
            }
    );

    public static void main(String[] args) {
        String msg = "Привет, дружок";
        for (Processor processor : PROCESSORS)
            if (processor.process(msg))
                break;
    }
}
