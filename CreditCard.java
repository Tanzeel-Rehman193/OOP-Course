class CreditCard implements PaymentMethod {
    // Add the following attributes:
    private String cardNumber;
    private double cardBalance;

    // Use a constructor to initialize the cardNumber and cardBalance.
    public CreditCard(String cardNumber, double cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }
    @Override
    public void processPayment(double amount) {
        if (cardBalance >= amount) {
            cardBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    @Override
    public void displayCardDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Current Balance: $" + cardBalance);
    }
}
