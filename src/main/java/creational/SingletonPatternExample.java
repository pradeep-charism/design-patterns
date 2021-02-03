package creational;

public class SingletonPatternExample {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        System.out.println(singletonPattern);

        SingletonPattern singletonPatternTwo = SingletonPattern.getInstance();
        System.out.println(singletonPatternTwo);

        SingletonPatternThreadSafe singletonPatternThreadSafe = SingletonPatternThreadSafe.getInstance();
        System.out.println(singletonPatternThreadSafe);
    }
}
