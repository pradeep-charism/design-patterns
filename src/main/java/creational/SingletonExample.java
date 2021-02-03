package creational;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(singletonTwo);

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe);
    }
}
