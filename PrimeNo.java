import java.util.Arrays;


public class PrimeNo {
	static int n=(int) 10e7;
	static int []p=new int [n];
	
	static int []prime= new int[n];
	static int  q=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =2; i < n; i++) {
			p[i]=1;		
			
		}
		
		for (int i = 2; i < n; i++) {
			if (p[i]==0)
				continue;
			prime[q++]=i;
			for (int j = 2*i; j < n; j+=i) {
				p[j]=0;
			}
		}
		System.out.println(q);
//		System.out.println(Arrays.toString(prime));
	}
	
}
