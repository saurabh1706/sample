
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class CountPairWithGivenSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = 1;// Integer.parseInt(br.readLine().trim());
		while (tc-- > 0) {
			String[] inputLine;
			inputLine = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int k = Integer.parseInt(inputLine[1]);
			int[] arr = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			int ans = new abc().getPairsCount(arr, n, k);
			System.out.println(ans);
		}
	}
}
// } Driver Code Ends

//User function Template for Java

class abc {

	int getPairsCount(int[] a, int n, int k) {
		// code here

		int b[] = new int[10000000];
		int ans = 0 ;
		for (int i : a) {
//			if (k - i > 0) {
//				if (b[k - i] > 0) {
//					ans++;
//				}
//			}
//			System.out.println(ans);
			b[i]++;

		}
		for (int i = 0; i < n; i++) {
			ans += b[k - a[i]];

			// if (arr[i], arr[i]) pair satisfies the condition,
			// then we need to ensure that the count is
			// decreased by one such that the (arr[i], arr[i])
			// pair is not considered
			if (k - a[i] == a[i])
				ans--;
		}

		// return the half of twice_count
		return ans / 2;

	}
}
