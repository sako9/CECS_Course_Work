package Assignment4;

public class StudentBody {
	public static void main (String[] args){
	Address school = new Address ("800 Lancaster Ave.", "Villanova","Pa",19085);
	Address jHome = new Address ("21 Junp Street", "Lynchburg","VA",24551);
	
	Student john = new Student ("John", "Smith", jHome,school);
	Student Jane = new Student ("Jane", "Smith", jHome,school);
	Student June = new Student ("June", "Smith", jHome,school);
	
	Course Calculus = new Course("Calculus");
	
	
	
	john.setTestScore(1,90);
	john.setTestScore(2,98);
	john.setTestScore(3, 80);
	
	June.setTestScore(1,56);
	June.setTestScore(2, 100);
	June.setTestScore(3,90);
	
	Jane.setTestScore(1, 80);
	Jane.setTestScore(2,88);
	Jane.setTestScore(3,85);
	
	Calculus.addStudent(john);
	Calculus.addStudent(Jane);
	Calculus.addStudent(June);
/*	System.out.println(john);
	System.out.println();
	System.out.println(Jane);*/
	
//	System.out.println(Calculus.Average());
	Calculus.roll();
	
	}

}
