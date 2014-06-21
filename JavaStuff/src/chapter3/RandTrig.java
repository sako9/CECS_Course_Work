package chapter3;

import java.util.Random;
import java.lang.Math;

public class RandTrig {
	
	public static void main(String[] args){
		
		int Low = 20;
		int High = 41;
		Random r = new Random();
		double number = r.nextInt(High-Low) + Low;
		
		double sinen = Math.sin(number);
		double cosinen = Math.cos(number);
		double tangentn = Math.tan(number);
		
		System.out.println("the sine of the random number " + number + " is "+ sinen);
		System.out.println("the cosine of the random number " + number + " is "+ cosinen);
		System.out.println("the tangent of the random number " + number + " is "+ tangentn);
	}

}
