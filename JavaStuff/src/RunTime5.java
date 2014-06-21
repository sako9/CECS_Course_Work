
public class RunTime5 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		int sum =0;
		int i=0;
		int j=0;
		int k=0;
		long n =400; 
		
		for(i = 0; i<n; i++)
			for(j=0; j<i*i;j++)
				if(j%i==0)
				for(k=0;k<j;k++)
			++sum;
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
