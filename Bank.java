package oopsassignment1;

public class Bank {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount(5000.00, 5.00);
		s.deposit(2000);
		System.out.println(s.getbalance());
		s.withdraw(1000);
		System.out.println(s.getbalance());

	}

}
