public class Book {
    private String bookName;
    private String publisher;
    private Person author;

    public Book() {
    }

    public Book(String b, String p, Person a) {
        bookName = b;
        publisher = p;
        author = a;
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: ");
        author.display();
    }
}
