package creational;

public class PrototypePattern implements Cloneable {

    private String name;
    private String address;
    private Phone phone;

    public PrototypePattern(String name, String address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PrototypePattern{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    protected PrototypePattern clone() throws CloneNotSupportedException {
        return (PrototypePattern) super.clone();
    }
}
