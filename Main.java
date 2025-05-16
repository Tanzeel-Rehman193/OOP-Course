public class Main {
    public static void main(String[] args) {
        Address a = new Address("A", "25", "Sahiwal");
        a.display();

        Person ali = new Person("Ali", a);
        ali.display();

        Book book = new Book("math", "Tarael", ali);
        book.display();
    }
}
