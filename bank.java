import java.util.Scanner;

public class bank {
    private String name;
    private String bcode;
    private int balance;
    static int totalobjects=0;
    bank(){
        name = null;
        bcode  = null;
        balance = 0;
        totalobjects++;
    }
    void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        name = sc.nextLine();
        System.out.println("Enter your Balance code:");
        bcode = sc.nextLine();
        System.out.println("Enter your Bank Balance:");
        balance = sc.nextInt();
    }
    void display(){
        System.out.println(name+bcode+balance);
    }
    public static void main(String[] args) {
        bank Ali = new bank();
        Ali.input();
        bank Ahmad  = new bank();
        Ahmad.input();
        bank Asad = new bank();
        Asad.input();
        System.out.println("Total accounts are:"+totalobjects);
    }
}
