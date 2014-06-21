
public class RunTime2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		int sum =0;
		int i=0;
		int j=0;
		long n =1600; 
		
		for(i = 0; i<n; i++)
			for(j=0; j<n*n;j++)
			++sum;
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
