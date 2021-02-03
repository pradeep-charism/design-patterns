package creational;

import java.util.Objects;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe singleton = new SingletonThreadSafe();

    private SingletonThreadSafe() {
        System.out.println("private constructor");
        if (Objects.nonNull(singleton)) {
            throw new RuntimeException("Use getInstance method to create");
        }
    }

    public static SingletonThreadSafe getInstance() {
        if (singleton == null) {
            synchronized (SingletonThreadSafe.class) {
                if (singleton == null) {
                    return new SingletonThreadSafe();
                }
            }
        }
        return singleton;
    }
}
