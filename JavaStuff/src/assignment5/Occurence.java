package assignment5;

import java.util.Random;

public class Occurence {
	
	 public static void main(String[] args) {
		 int[] occur = new int[51];
		 Random generator = new Random();
		 int num = generator.nextInt(51);
		 
		for(int i=0;i<50; i++){
			if(num <= 50)
				occur[num]++;
			    num = generator.nextInt(51);
			}
		for(int i = 0; i < occur.length;i++){
			if(occur[i]>0)
			System.out.println(i + "="+ occur[i]);
		}
	 }

}
