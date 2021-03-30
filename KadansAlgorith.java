
public class KadansAlgorith {
	static class pair
	{
		int max;
		int start;
		int end;
	}
	
	public static void main(String[] args) {
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		ReverseArray.printArray(a);
		
		pair ans=kadans(a);
		
		System.out.println(ans.max+" "+ans.start+" "+ans.end);
		
		
		
		
	}
	
	//It will Work for Both Cases Positive as well as negative .. :)

	private static pair kadans(int[] a) {
		// TODO Auto-generated method stub
		int maxSoFar=Integer.MIN_VALUE,maxEndingHere=a[0];
		int start=0,end=0,t=0;
		for(int i:a)
		{
			maxEndingHere+=i;
			
			if (maxEndingHere<i)
			{
				maxEndingHere=i;
				System.out.println("i"+i);
				start =t;
			}
			if (maxSoFar<maxEndingHere)
			{
				end=t;
				maxSoFar=maxEndingHere;
			}
			
			t++;
			
		}
		System.out.println(start +" "+end);
		
		pair p = new pair() ;
		p.max=maxSoFar;
		p.start=start;
		p.end=end;
		return p;
		
	
	}

}
