import java.util.Scanner;
public class Student {
    private String name;
    private String rollNo;
    private int semester;
    private String course;
    private int marks;
    private char grade;

     Student() {
        name = "Unknown";
        marks = 0;
        calculateGrade();
    }

     Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        calculateGrade();
    }

     void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter marks: ");
        marks = input.nextInt();
        calculateGrade();
    }

    void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void showGrade() {
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
       
        Student student1 = new Student();
        System.out.println("Enter student 1 info:");
        student1.getInput();
        student1.showGrade();

        Student student2 = new Student("Tanzeel", 85);
        System.out.println("Student 2 grade:");
        student2.showGrade();

        Student student3 = new Student("Asad", 50);
        System.out.println("Student 3 grade:");
        student3.showGrade();
    }
}
