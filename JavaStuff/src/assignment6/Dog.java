package assignment6;

public class Dog implements Speaker {

	public void speak(){
		System.out.println("Woof woof bow wow.");
		
	}
	
	public void announce(String str){
		System.out.println("My owners name is "+str);
	}

}