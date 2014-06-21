package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Area {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("This is a program that uses Heron's formula to find the area of a triangle.");
		System.out.println("Please enter the side lengths of a triangle.");
		
		System.out.println("Side 1:");
		double side1 = console.nextDouble();
		
		System.out.println("Side 2:");
		double side2 = console.nextDouble();
		
		System.out.println("Side 3:");
		double side3 = console.nextDouble();
		
		double S = .5 * (side1 + side2 + side3);
		
		double X = S*(S-side1)*(S-side2)*(S-side3);
		double Area = Math.pow(X,.5);
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("The area of the triangle in "+df.format(Area));
		

	}

}
