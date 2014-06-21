package Assignment4;

public class Student {
	private String firstname,lastname;
	private Address homeAddress, schoolAddress;
	private int test1,test2,test3;
	
	
	public Student (String first, String last, Address home,Address school){
		firstname = first;
		lastname = last;
		homeAddress = home;
		schoolAddress = school;
		test1=0;
		test2=0;
		test3=0;
	}
	
	public void setTestScore(int num,int score){
		if(num==1)
			test1 =score;
		if(num==2)
			test2 = score;
		if(num==3)
			test3 = score; 
	}
	
	public int getTestScore(int num){
		int score = 0;
		
		if(num==1)
			score = test1; 
		if(num==2)
			score = test2;
		if(num==3)
			score = test3; 
		return score;
	}
	
	public int Average(){
		int sum = test1+test2+test3;
		int ave = sum/3;
		return ave;
	}
	
	public String toString(){
		String result;
		
		result = firstname + " " + lastname + "\n";
		result += "Home Address:\n"+ homeAddress+ "\n";
		result += "School Address:\n"+ schoolAddress + "\n";
		result += "Test scores:\n"+ test1+","+test2+","+test3+"\n";
		result += "Average:\n"+ Average();
		return result;
	}

}
