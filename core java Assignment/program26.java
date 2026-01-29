package myfirst;

//program to check amount grater than balance or not with exception
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(int amount) {
        super("Sorry, insufficient balance, you need more " + amount + " Rs. To perform this transaction.");
    }
}

class BankAccount {
    int balance = 2000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int needed = amount - balance;
            throw new InsufficientBalanceException(needed);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        BankAccount account = new BankAccount();

	        System.out.println("Account balance is: " + account.balance);
	        System.out.print("Enter withdraw amount: ");
	        int amount = sc.nextInt();

	        try {
	            account.withdraw(amount);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();

	}

}
