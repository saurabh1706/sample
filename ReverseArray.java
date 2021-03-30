



public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {1,2,3,4,5,6,7,8,9};
		printArray(a);
		reverseArray(a,0,a.length-1);
		System.out.println("After Reversing");
		printArray(a);
		

	}

	public static void printArray(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i:a)
		{
			System.out.print(i+" ");

		}
		System.out.println();

		
	}

	private static void reverseArray(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int start=i,end=j;
		
		if  (start>=end)
			return;
		int t=a[start];
		a[start]=a[end];
		a[end]=t;
		
		reverseArray(a, i+1, j-1);
		
		
		
		
		
		
	}

}
