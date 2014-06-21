package assignment3;

import java.util.Scanner;
import java.lang.String;
public class ReadString {
	
	public static void main (String[] arg){
		String word;
		
		int vcount =0;
		int Vcount = 0;
		int count = 0;
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter in a sentence:");
		word = console.nextLine();

		for(int i =0;i<word.length();i++){
			switch(word.charAt(i)){
			case 'A':
				Vcount++;
				break;
			case 'E':
				Vcount++;
				break;
			case 'I':
				Vcount++;
				break;
			case 'O':
				Vcount++;
				break;
			case 'U':
				Vcount++;
				break;
			case 'a':
				vcount++;
				Vcount++;
				break;
			case 'e':
				vcount++;
				Vcount++;
				break;
			case 'i':
				vcount++;
				Vcount++;
				break;
			case 'o':
				vcount++;
				Vcount++;
				break;
			case 'u':
				vcount++;
				Vcount++;
				break;
			case ' ':
				break;
			default:
				count++;
			}
		}
		
	System.out.println("# of lowercase vowels:" + vcount + " # of vowels:" + Vcount +" # of non vowels:" + count);
		
	}
}
