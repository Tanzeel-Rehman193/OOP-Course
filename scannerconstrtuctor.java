import java.util.Scanner;

class scannerconstrtuctor {
    String name, author;
    int price;

    scannerconstrtuctor() {
        name = null;
        author = null;
        price = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter books name:");
        name = sc.nextLine();
        System.out.println("Enter books author's name");
        author = sc.nextLine();
        System.out.println("Enter price of this book");
        price = sc.nextInt();
    }

    void display() {
        System.out.println("Book's namne is :" + name);
        System.out.println("Author's name is:" + author);
        System.out.println("Price of this book is:" + price);
    }

    public static void main(String[] args) {
        scannerconstrtuctor Book = new scannerconstrtuctor();
        Book.input();
        Book.display();
    }
}
