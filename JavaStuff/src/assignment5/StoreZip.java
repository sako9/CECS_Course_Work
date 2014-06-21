package assignment5;

import java.util.Scanner;

public class StoreZip{
	private final int MAX = 3;
	private Zip[] listz = new Zip[MAX];
	private int zipSize = 0;
	
	public void add(){
		if(zipSize != MAX){
			listz[zipSize] = new Zip();
			
			Scanner scan = new Scanner(System.in);
			System.out.println("First name?");
			String s =scan.next();
			listz[zipSize].setFirst(s);
			
			System.out.println("Last name?");
			s=scan.next();
			listz[zipSize].setLast(s);
			
			System.out.println("Zipcode?");
			int num=scan.nextInt();
			listz[zipSize].setZip(num);
			
			zipSize++;
		}
		else
			System.out.println("Cannot handel anymore entries");
	}
	
	public void printzip(){
		for(int i =0; i<zipSize;i++){
			System.out.println(listz[i]);
		}
	}
	
	public static void main(String args[]){
		StoreZip z = new StoreZip();
		z.add();
		z.add();
		z.add();
		z.printzip();
	}
	
}
