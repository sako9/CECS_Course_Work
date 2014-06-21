package assignment5;

import java.text.NumberFormat;
import java.util.Scanner;

public class Zip {
	
	private String First;
	private String Last;
	private int zip;
	
	public Zip(){
		First ="";
		Last="";
		zip=0;
	}
	
	public void setFirst(String s){
		First = s;
	}
	
	public void setLast(String s){
		Last = s;
	}
	
	public void setZip(int i){
		zip = i;
	}
	
	public String toString(){
		return First + "\t" + Last + "\t" + zip; 
	}
}

