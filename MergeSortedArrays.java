
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class MergeSortedArrays {
	// Driver code
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;//Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int m = Integer.parseInt(inputLine[1]);
			int arr1[] = new int[n];
			int arr2[] = new int[m];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr1[i] = Integer.parseInt(inputLine[i]);
			}
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < m; i++) {
				arr2[i] = Integer.parseInt(inputLine[i]);
			}

			new aa().merge(arr1, arr2, n, m);

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr1[i] + " ");
			}
			for (int i = 0; i < m; i++) {
				str.append(arr2[i] + " ");
			}
			System.out.println(str);
		}
	}
}// } Driver Code Ends

class aa {

	public void merge(int a[], int b[], int n, int m) {
		// code here
		int p = 0, q = 0;

		while (true) {
			
			if (p>=n)
			{
				
				break;
			}
			if (q>=m)
			{
				break;
			}

			if (a[p] > b[q]) {
				int temp=a[p];
				a[p]=b[q];
				b[q]=temp;
				
				p++;
				if (q+1<m)
				{
					if (b[q]>b[q+1])
					{
						int t1=b[q];
						b[q]=b[q+1];
						b[q+1]=t1;
					}
				}
			}
			else
			{
				p++;
			}

		}
		
		Arrays.sort(b);
		
		
		
		p = 0;q = 0;

		while (true) {
			
			if (p>=n)
			{
				
				break;
			}
			if (q>=m)
			{
				break;
			}

			if (a[p] > b[q]) {
				int temp=a[p];
				a[p]=b[q];
				b[q]=temp;
				
				p++;
				if (q+1<m)
				{
					if (b[q]>b[q+1])
					{
						int t1=b[q];
						b[q]=b[q+1];
						b[q+1]=t1;
					}
				}
			}
			else
			{
				p++;
			}

		}
		Arrays.sort(b);
		
		

	}

}
/*
10 10
7 9 9 10 11 11 13 14 17 19
1 1 4 5 8 11 13 16 19 19
*/




