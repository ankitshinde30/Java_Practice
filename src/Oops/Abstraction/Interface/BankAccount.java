package Oops.Abstraction.Interface;

public class BankAccount implements Deposit,Withdraw{
	double balance=1000;

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
		System.out.println("Balance: "  + balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Withdrawn: "+amount);
		}else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("Balance: "+balance);
		
	}


}
