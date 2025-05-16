import java.util.Scanner;
public class employee {
    protected int id;
    protected String name;
    protected String address;
    employee(){

    }
    void input(){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter your id");
id = sc.nextInt();
System.out.println("Enter your Name");
name = sc.next();
System.out.println("Enter your address");
address = sc.next();
    }
    void display(){
        System.out.println("Id is"+ id);
        System.out.println("name is"+ name);
        System.out.println("address is"+ address);
    }
}
 class internee extends emp {
protected String language;
internee(){

}
Scanner sc = new Scanner(System.in);
void input(){
    super.input();
    System.out.println("Enter your programming language");
    language = sc.nextLine();
}
void display(){
    super.display();
    System.out.println(" programming Language is:"+ language);
}
public static void main(String[] args) {
    internee bilal = new internee();
    bilal.input();
    bilal.display();
}
}
