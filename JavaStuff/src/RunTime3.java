
public class RunTime3 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		int sum =0;
		int i=0;
		int j=0;
		long n =1000000; 
		
		for(i = 0; i<n; i++)
			for(j=0; j<i;j++)
			++sum;
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
