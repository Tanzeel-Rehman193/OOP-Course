import java.util.Scanner;

public class product {
    private int id = 0;
    private Double price;
    private int Quantity;
    static int TQ = 0;
    product(){
        id++;
        price = null;
        Quantity = 0;
    }
    void addproduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price:");
        price =sc.nextDouble();
        System.out.println("Enter Quantity:");
        Quantity = sc.nextInt();
        TQ +=Quantity;
    }
    void Saleproduct(int Q){
        Scanner sc = new Scanner(System.in);
        Q = sc.nextInt();
        if (Q>=Quantity) {
            Quantity-=Q;
            TQ = TQ-Quantity;
        }
    }
    void restock(int r){
Quantity+=r;
TQ = TQ+r;
    }
    public static void main(String[] args) {
        product ali = new product();
        ali.addproduct();
        product Asad = new product();
        Asad.addproduct();
        product moiz = new product();
        moiz.addproduct();
        System.out.println("Total quantity is :"+TQ);


    }
}
