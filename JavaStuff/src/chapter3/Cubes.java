package chapter3;

import java.util.Scanner;
import java.lang.Math;

public class Cubes {


	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int num1 = console.nextInt();
		
		System.out.println("Please enter a number");
		int num2 = console.nextInt();
		
		int num3 = (int) (Math.pow(num1,3) + Math.pow(num2,3));
		
		System.out.println("The sum of the cubed numbers is "+ num3 );

	}

}
