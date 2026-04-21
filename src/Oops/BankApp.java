package Oops;

public class BankApp {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		String name= sa.accountHolder="Ankit Shinde";
		System.out.println("Name of the Account Holder Is : "+ name);
		double balance = sa.balance= 20000;
		System.out.println("Current Balance amount : "+ balance);
		
		sa.deposits(3000);
		System.out.println("Current Balance after deposited amount : "+ balance);
		
		sa.addInterst();
		System.out.println("Current Balance amount after Interest : "+ balance);
		
		
		
		
		
		
		
		
		
		

	}

}
