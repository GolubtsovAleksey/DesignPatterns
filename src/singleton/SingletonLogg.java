package singleton;

import java.time.LocalDate;

public class SingletonLogg {

    private static SingletonLogg singletonLogg;

    private SingletonLogg() {
    }

    public static SingletonLogg getInstance() {
        if (singletonLogg == null) {
            singletonLogg = new SingletonLogg();
        }
        return singletonLogg;
    }

    public void classLogg(Object obj, String info) {
        System.out.println("Log info: " + LocalDate.now() + " - " + obj.getClass().getName() + " - " + info);
    }
}

