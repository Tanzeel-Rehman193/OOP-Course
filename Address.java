public class Address {
    private String street;
    private String house;
    private String city;

    public Address() {
    }

    public Address(String s, String h, String c) {
        street = s;
        house = h;
        city = c;
    }

    public void display() {
        System.out.println("House No: " + house + " Street No: " + street + " City: " + city);
    }
}
