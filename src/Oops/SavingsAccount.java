package Oops;

public class SavingsAccount extends Account{
	double interestRate=5.0;
	
	void addInterst() {
		double interest = balance * interestRate /100; 
		balance += interest;
		System.out.println("Interest added : "+ interest);
	}

}
