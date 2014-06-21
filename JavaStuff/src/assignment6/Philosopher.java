package assignment6;

public class Philosopher implements Speaker {
	
	public void speak(){
		System.out.println("I Think therefore, I am.");
		
	}
	
	public void announce(String str){
		System.out.println("My name is "+str);
	}

}
