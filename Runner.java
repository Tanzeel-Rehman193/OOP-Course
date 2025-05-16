public class Runner {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard("1234", 1000.0);

        myCard.displayCardDetails();

        System.out.println("Attempting to pay $200:");
        myCard.processPayment(200.0);

        myCard.displayCardDetails();
    }
}
