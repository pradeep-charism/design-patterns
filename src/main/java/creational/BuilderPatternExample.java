package creational;

public class BuilderPatternExample {

    public static void main(String[] args) {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        BuilderPattern object = builder.address("US").name("Pradeep").build();
        System.out.println(object);
    }
}
