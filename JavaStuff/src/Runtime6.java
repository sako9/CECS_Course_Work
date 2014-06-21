
public class Runtime6 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		int sum =0;
		int i=0;
		long n =1000000; 
		
		for(i = 0; i<n; i++)
			++sum;
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
