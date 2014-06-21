package assignment3;

public class Dice {
private final int MAX =6;
	
	private int Dval;
	
	public void Dice(int num){
		Dval=num;
	}
		
	public void setDice(int num){
		if(num<=MAX && num >0){
		Dval = num;
		}
	}
	
	public int getDice(){
		return Dval;
	}
		
	public void roll(){
		Dval = (int)(Math.random()*MAX)+1;
	}
	

	public Dice(){
		Dval=1;
	}
	public static void main(String[]arg){
		Dice mydice = new Dice();
		mydice.setDice(8);
		mydice.roll();
		System.out.println("The value of the two dice is " + mydice.getDice());
	}
}

