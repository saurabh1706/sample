
//{ Driver Code Starts
//Initial Template for Java
/*
1
2
4
1 5 8 10
3 5 6 8

1
5
10
2 6 3 4 7 2 10 3 2 1


 */
import java.io.*;
import java.util.*;

public class MinimiseMaxHeight {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		while (tc-- > 0) {
			String[] inputLine;
			inputLine = br.readLine().trim().split(" ");
			int k = Integer.parseInt(inputLine[0]);
			inputLine = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int[] arr = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			int ans = new Solution1().getMinDiff(arr, n, k);
			System.out.println(ans);
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution1 {
	int getMinDiff(int[] arr, int n, int k) {
		// code here
//		int ans = 0;
//
//		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//		for (int i : arr) {
//
//			if (i > k) {
//				int temp = i - k;
//				if (max < temp) {
//					max = temp;
//				}
//
//			}
//			if (i < k) {
//				int temp = i + k;
//				if (min > temp) {
//					min = temp;
//				}
//			}
//
//		}
//		System.out.println("max" + max);
//		System.out.println("min" + min);
//
//		ans = max - min;
//		
//		 return ans;
	         Arrays.sort(arr);
	         int min_elem, max_elem;
	         int ans = arr[n-1] - arr[0];
	        
	         for (int i=1 ; i< n; i++){
	            
	             if(arr[i] < k)
	                 continue;
	         
	             max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );
	             min_elem = Math.min(arr[0] + k, arr[i] - k );
	             ans = Math.min(ans, max_elem - min_elem);
	         }
	         return ans;
	   
	    
	}
}
