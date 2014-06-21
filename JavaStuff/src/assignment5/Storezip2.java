package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Storezip2{
	private ArrayList<Zip2> listz = new ArrayList<Zip2>();
	
	public void addZip(){
			
			
			String a,b,c,d,e;
			int num;
			long num2;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("First name?");
			a=scan.next();
			
			System.out.println("Last name?");
			b=scan.next();
			
			System.out.println("Zipcode?");
			num=scan.nextInt();
			
			System.out.println("street address?");
			c=scan.next();
			c=c+scan.nextLine();
			
			System.out.println("City?");
			d=scan.next();
			
			System.out.println("State?");
			e=scan.next();
			
			System.out.println("phone?");
			num2 = scan.nextLong();
			
			Zip2 z = new Zip2(a,b,num,c,d,e,num2);
			
			listz.add(z);
	}
	
	public void printzip(){
		for(int i =0; i<listz.size();i++){
			System.out.println(listz.get(i));
		}
	}
	
	public static void main(String args[]){
		Storezip2 z = new Storezip2();
		z.addZip();
		z.addZip();
		z.printzip();
	}
	
}

