package oopsassignment1;

public class SavingsAccount 
{
	double balance;
	double interest;
	public SavingsAccount(double balance, double interest)
	{
		super();
		this.balance = balance;
		this.interest = interest;
	}
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	void withdraw(int amount)
	{
		balance=balance-amount;
	}
	public double getbalance()
	{
		double In=balance*(interest/100);
		balance+=In;
		return balance;
	}
}
