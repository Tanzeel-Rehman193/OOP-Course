public class Person {
    String name;
    Address ad;

    public Person() {
    }

    public Person(String n, Address a) {
        name = n;
        ad = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        ad.display();
    }
}
