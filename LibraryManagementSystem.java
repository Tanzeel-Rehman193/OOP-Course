public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Librarian librarian = new Librarian(101, "tanzeel Rehman", "tanzeel@library.com", 501, "Morning");

        Member member = new Member(201, "Waleed", "waleed@library.com", 1001, 3);

        Guest guest = new Guest(301, "muneeb", "muneeb@library.com", "Browsing catalog");

        // Display user details
        System.out.println("Librarian Details:");
        librarian.displayDetails();

        System.out.println("\nMember Details:");
        member.displayDetails();

        System.out.println("\nGuest Details:");
        guest.displayDetails();
    }
}
