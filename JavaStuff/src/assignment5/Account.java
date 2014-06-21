package assignment5;

import java.text.NumberFormat;

public class Account {
	
	private final double Rate = 0.035;
	
	private long acctnumber;
	private double balance;
	private String name;
	
	
	public Account (String owner, long account, double initial){
		
		name = owner;
		acctnumber = account;
		balance = initial;
	}
	
	public void deposit(double amount){
		balance += amount;
		System.out.println("Your new balance is "+ balance);
	}
	
	public void withdraw(double amount){
		if(amount>balance)
			System.out.println("You do not have enough funds to make this transaction");
		else
		balance-= amount;
		System.out.println("Your new balance is "+ balance);
	}
	
	public void addInterest(){
		balance+= (balance*Rate);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public long getacctNumber(){
		return acctnumber;
	}
	
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctnumber + "\t" + name + "\t" + fmt.format(balance); 
	}

}
