package creational;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("private constructor");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }
}
