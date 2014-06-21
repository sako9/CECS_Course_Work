package Assignment4;

public class Task implements Priority {
	private String name;
	private int Prioritylevel;
	
	public Task(String Tname){
		name = Tname;
		Prioritylevel = 1;
	}
	
	public void setPriority(int level){
		
		Prioritylevel = level;
	}
	
	public int getPriority(){
		return Prioritylevel;
	}
	
	public static void main(String[] args) {

		Task todo = new Task("todo");
		todo.setPriority(9001);
		System.out.println("priority is " + todo.getPriority());


		}


}
