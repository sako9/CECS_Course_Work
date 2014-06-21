package assignment3;

public class PairOfDice {
	private final int MAX =6;
	
	private int Dval1,Dval2;
	
	public void Dice(int num,int num2){
		Dval1=num;
		Dval2 = num2;
	}
		
	public void setD1(int num){
		Dval1 = num;
	}
	
	public int getD1(){
		return Dval1;
	}
	
	public void setD2(int num){
		Dval2 = num;
	}
	
	public int getD2(int num){
		return Dval2;
	}
	
	public void roll(){
		Dval1 = (int)(Math.random()*MAX)+1;
		Dval2 =(int)(Math.random()*MAX)+1;
	}
	
	public int sum(){
		return Dval1 + Dval2;
	}
	public void Dice(){
		Dval1=1;
		Dval2=2;
	}
	public static void main(String[]arg){
		PairOfDice mydice = new PairOfDice();
		mydice.roll();
		System.out.println("The sum of the two dice is " + mydice.sum());
	}
}
