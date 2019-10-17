import java.util.Scanner;

public class SavingsAccount{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance){
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest(){
        if(annualInterestRate < 0.05) {
            for (int i = 0; i < 12; i++) {
                savingsBalance += (savingsBalance * annualInterestRate) / 12;
                System.out.printf("Month %d: %.2f\n", i + 1, savingsBalance);
            }
        }else {
            savingsBalance += (savingsBalance * annualInterestRate) / 12;
            System.out.printf("Month 13: %.2f\n", savingsBalance);
        }
    }

    public void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }

    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("*** Interest rate 4% ***");

        System.out.println("SAVER1");
        saver1.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();

        System.out.println("SAVER2");
        saver2.modifyInterestRate(0.04);
        saver2.calculateMonthlyInterest();

        System.out.println("*** Interest rate 5% ***");

        System.out.println("SAVER1");
        saver1.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();

        System.out.println("SAVER2");
        saver2.modifyInterestRate(0.05);
        saver2.calculateMonthlyInterest();
    }

}
