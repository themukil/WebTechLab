class SavingsAccount {
    private static double annualInterestRate; // Static variable for annual interest rate
    private double savingsBalance; // Instance variable for savings balance

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}

public class Q8 {
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("Initial balances:");
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("\nMonth " + month + " balances:");
            System.out.println("Saver 1: " + saver1.getSavingsBalance());
            System.out.println("Saver 2: " + saver2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances after interest rate change:");
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());
    }
}
