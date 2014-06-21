package assignment6;

public class Speaking {
	
	public static void main(String[] args){
		
		Speaker guest;
		guest = new Philosopher();
		guest.speak();
		guest = new Dog();
		guest.speak();
		guest.announce("Mike");
		guest = new Philosopher();
		guest.announce("Plato");
		guest = new President();
		guest.speak();
		guest.announce("indubitably");
	}

}
