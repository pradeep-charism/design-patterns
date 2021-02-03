package creational;

public class BuilderPattern {

    private String name;
    private String address;

    public BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder {

        private String name;
        private String address;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
