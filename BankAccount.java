
public class BankAccount {

	private String  name;
	
	private int accNum;
	
	private int balance;
	
	public BankAccount(String a, int b)
	{
		name= a;
		accNum=b;
	}
	public BankAccount(String a ,int b, int c)
	{
		name=a;
		accNum=b;
		balance=c;
	}
	public void deposit(int a)
	{
		balance= balance+ a;
	}
	public void withdraw(int a)
	{
		balance= balance- a;
	}
	public int getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Name: " +name + "Acount Number:  "+ accNum + "Balance: " + balance	;
	}
}
