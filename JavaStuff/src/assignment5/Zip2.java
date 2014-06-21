package assignment5;

public class Zip2 {
	
	private String First;
	private String Last;
	private int zip;
	private String address;
	private String City;
	private String State;
	private long phone;
	
	public Zip2(String a,String b, int c, String d, String e, String f,long g){
		First = a;
		Last = b;
		zip = c;
		address = d;
		City = e;
		State = f;
		phone = g;
	}
	
	public void setFirst(String s){
		First = s;
	}
	
	public void setLast(String s){
		Last = s;
	}
	
	public void setZip(int i){
		zip = i;
	}
	
	public void setAddress(String s){
		address = s;
	}
	
	public void setCity(String s){
		City = s;
	}
	
	public void setState(String s){
		State = s;
	}
	
	public void setPhone(long num){
		phone = num;
	}
	
	public String toString(){
		return First + "\t" + Last + "\t" + zip + "\t" + address + "\t" + City + "\t" + State + "\t" + phone; 
	}
}