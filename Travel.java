import java.util.Scanner;
public class Travel {
    private int km;
    private int hrs;

     Travel() {
        km = 0;
        hrs = 0;
    }

     void ask() {
        Scanner input = new Scanner(System.in);
        System.out.print("KM? ");
        km = input.nextInt();
        System.out.print("Hours? ");
        hrs = input.nextInt();
    }

     void show() {
        System.out.println("KM: " + km);
        System.out.println("Hours: " + hrs);
    }

     Travel add(Travel other) {
        Travel total = new Travel();
        total.km = this.km + other.km;
        total.hrs = this.hrs + other.hrs;
        return total;
    }

    public static void main(String[] args) {
        Travel trip1 = new Travel();
        Travel trip2 = new Travel();

        System.out.println("Trip 1:");
        trip1.ask();
        System.out.println("Trip 2:");
        trip2.ask();
        Travel totalTrip = trip1.add(trip2);
        System.out.println("\nTotal:");
        totalTrip.show();
    }
}
