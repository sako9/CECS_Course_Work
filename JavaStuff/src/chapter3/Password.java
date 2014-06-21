package chapter3;
import java.util.*;

public class Password {
	
	public static void main(String[] args){
	
	Scanner console = new Scanner(System.in);

    System.out.println("please enter your first name.");
    String Fname = console.next();
    
    System.out.println("Please enter your last name.");
    String Lname = console.next();
    
    int Low = 10;
    int High = 100;
    Random r = new Random();
    int number = r.nextInt(High-Low) + Low;
    
    String Passw = Fname.substring(0,1) + Lname.substring(0,5);
    System.out.print(""+Passw+number);
	}
    

}

