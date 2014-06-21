package assignment5;

public class Bank {
	private final int Max=30;
	private Account[] Accounts = new Account[Max];
	private String Name;
	private int numAcct =0;
	
	public Bank(String name){
		Name = name;
	}
	
	public void addAccount(Account acct){
		if(numAcct>Max)
			System.out.println("Bank can't hold anymore accounts");
		Accounts[numAcct] = acct;
		numAcct++;
	}
	
	public void deposit(long Acctnum,double amount){
		boolean found=false;
		for(int i = 0;i<numAcct;i++){
			if(Accounts[i].getacctNumber() == Acctnum){
				Accounts[i].deposit(amount);
				found = true;
			}
		}if(found == false)
			System.out.println("Account number does not match those on file");
	}
	
	public void withdraw(long Acctnum,double amount){
		boolean found=false;
		for(int i = 0;i<numAcct;i++){
			if(Accounts[i].getacctNumber() == Acctnum){
				Accounts[i].withdraw(amount);
				found = true;
			}
		}if(found == false)
			System.out.println("Account number does not match those on file");
	}
	
	public void printAccount(long Acctnum){
		boolean found=false;
		for(int i = 0;i<numAcct;i++){
			if(Accounts[i].getacctNumber() == Acctnum){
				System.out.println(Accounts[i]);
				found = true;
			}
		}if(found == false)
			System.out.println("Account number does not match those on file");
	}
	
	public void upIntrst(){
		for(int i = 0;i<numAcct;i++){
			Accounts[i].addInterest();
		}
	}
	
	public void printAccounts(){
		for(int i =0; i<numAcct;i++){
			System.out.println(Accounts[i]);
		}
	}
	
	public static void main(String[] args){
		Account sam = new Account("Sam",8675309,200.00);
		Account dan = new Account("Dan",1234567,500.00);
		Account Jdudds = new Account("Justin",987654,254);
		Bank myBank = new Bank("Chase");
		
		myBank.addAccount(sam);
		myBank.addAccount(dan);
		myBank.addAccount(Jdudds);
		
		myBank.deposit(8675309, 233.00);
		myBank.withdraw(1234567,50.00);
		System.out.println();
		myBank.printAccounts();
		myBank.upIntrst();
		System.out.println();
		myBank.printAccounts();
		System.out.println();
		myBank.printAccount(54);
		
	}

}
