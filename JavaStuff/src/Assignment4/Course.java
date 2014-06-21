package Assignment4;

public class Course {

	private int max = 5;
	private Student[] Students = new Student[max];
	String Cname;
	private int numStudents = 0;
	
	public Course(String name){
		Cname = name;
	}
	
	public void addStudent(Student stud){
		Students[numStudents] = stud;
		numStudents++;
	}
	
	public int Average(){
		
		int sum=0;
		int average = 0;
		
		for(int i =0;i<numStudents;i++){
			sum += Students[i].Average();
		}
		average += sum/numStudents;
		return average;
	}
	
	public void roll(){
		for(int i =0;i<numStudents;i++){
			System.out.println(Students[i]);
			System.out.println();
		}
	}
}
