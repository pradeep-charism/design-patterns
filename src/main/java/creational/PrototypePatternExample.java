package creational;

public class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        PrototypePattern pattern = new PrototypePattern("Pradeep", "USA", new Phone(1234));
        PrototypePattern clone = pattern.clone();
        System.out.println(pattern);
        System.out.println(clone);
        System.out.println("Modifying original object");
        pattern.setAddress("UK");
        pattern.setPhone(new Phone(54331));
        System.out.println(pattern);
        System.out.println(clone);
    }

}
