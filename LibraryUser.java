class LibraryUser {
    private int userID;
    private String name;
    private String email;

    public LibraryUser(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    public int getUserID(){
        return userID;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}

// Derived class: Librarian
class Librarian extends LibraryUser {
    private int employeeID;
    private String workShift;

    public Librarian(int userID, String name, String email, int employeeID, String workShift) {
        super(userID, name, email); 
        this.employeeID = employeeID;
        this.workShift = workShift;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Work Shift: " + workShift);
    }
}

// Derived class: Member
class Member extends LibraryUser {
    private int membershipID;
    private int borrowedBooksCount;

    public Member(int userID, String name, String email, int membershipID, int borrowedBooksCount) {
        super(userID, name, email); 
        this.membershipID = membershipID;
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }
}

// Derived class: Guest
class Guest extends LibraryUser {
    private String visitPurpose;

    public Guest(int userID, String name, String email, String visitPurpose) {
        super(userID, name, email); 
        this.visitPurpose = visitPurpose;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Visit Purpose: " + visitPurpose);
    }
}

