package Oops;

public class Account {
	String accountHolder;
	double balance;
	
		void deposits(double amount) {
			balance += amount;
			System.out.println("Deposited : "+amount);
		}
}
