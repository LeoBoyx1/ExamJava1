public class Bank {
    private double balance;
    private double rate;

    // Constructor
    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    // Method to calculate monthly interest
    public double calculateInterest() {
        return balance * (rate / 1200);
    }

    public static void main(String[] args) {
        // Test the Bank class
        double initialBalance = 1000;
        double annualInterestRate = 10;

        // Create an instance of the Bank class
        Bank myBank = new Bank(initialBalance, annualInterestRate);

        // Calculate and print monthly interest
        double monthlyInterest = myBank.calculateInterest();
        System.out.println("Monthly Interest: $" + monthlyInterest);
    }
}
