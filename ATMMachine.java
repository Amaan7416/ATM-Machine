import java.util.Scanner;

class ATM {

    static double Balance;
    int PIN = 7416;
    Scanner sc = new Scanner(System.in);

    public void checkpin() {
        System.out.println("Enter Your pin:");
            int enteredpin = sc.nextInt();
            if (enteredpin == PIN) {
                menu();
            } else {
                System.out.println("Enter a valid pin");
                menu();
            }
        }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. WithdrawMoney");
        System.out.println("3. DepositMoney");
        System.out.println("4. EXIT");

            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                WithdrawMoney();
            } else if (opt == 3) {
                DepositMoney();
            } else if (opt == 4) {
                System.out.println("Thank you for using ATM");
                return;
            } else {
                System.out.println("Enter a valid choice");
            }
        }

    public void checkBalance() {
            System.out.println("Balance:" + Balance);
        menu();
    }

    public void WithdrawMoney() {
        System.out.println("Enter Amount to withdraw");
        try  {
            float amount = sc.nextFloat();
            if (amount > Balance) {
                System.out.println("Insufficient Balance");
            } else {
                Balance = Balance - amount;
                System.out.println("Money withdraw successfully");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid amount.");
        }
        menu();
    }

    public void DepositMoney() {
        System.out.println("Enter the Amount:");
        try {
            double amount = sc.nextDouble();
            Balance = Balance + amount;
            System.out.println("Money deposit successfully");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid amount.");
        }
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
    }
}