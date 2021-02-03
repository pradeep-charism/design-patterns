package creational;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {
        System.out.println("private constructor");
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            return new SingletonPattern();
        }
        return singletonPattern;
    }
}
