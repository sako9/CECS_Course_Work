// ********************************************************************
// Echo.java Author: Lewis/Loftus
//
// Demonstrates the use of the nextLine method of the Scanner class
// to read a string from the user.
// ********************************************************************
package chapter2;

import java.util.Scanner;

public class H_Echo
{

	public static void main(String[] args)
	{
		String message;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a line of text:");

		message = scan.nextLine();

		System.out.println("You entered: \"" + message + "\"");
	}
}
