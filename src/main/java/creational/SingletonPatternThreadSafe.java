package creational;

import java.util.Objects;

public class SingletonPatternThreadSafe {

    private static volatile SingletonPatternThreadSafe singleton = new SingletonPatternThreadSafe();

    private SingletonPatternThreadSafe() {
        System.out.println("private constructor");
        if (Objects.nonNull(singleton)) {
            throw new RuntimeException("Use getInstance method to create");
        }
    }

    public static SingletonPatternThreadSafe getInstance() {
        if (singleton == null) {
            synchronized (SingletonPatternThreadSafe.class) {
                if (singleton == null) {
                    return new SingletonPatternThreadSafe();
                }
            }
        }
        return singleton;
    }
}
