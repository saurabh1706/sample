



public class MinMax {
	static class pair
	{
		int min,max;
	}
	
	public static void main(String[] args) {
		
		
		int []a = {1,2,3,4,5,6,7,8,9,12365};
		pair aa=minMax(a);
		System.out.println("Min and Max respectively are "+aa.min+" "+aa.max);
	}

	private static pair minMax(int[] a) {
		// TODO Auto-generated method stub
		pair aa=new pair();
		aa.min=(int) (10e7+1);
		aa.max=-1;
		for(int i:a)
		{
			if (aa.max<i)
			{
				aa.max=i;
			}
			if (aa.min>i)
			{
				aa.min=i;
			}
			
		}
		
		
		
		return aa;
	}
}
