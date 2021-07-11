
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class CommonEleInThreeArrray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 1;// sc.nextInt();
		while (t-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();

			int A[] = new int[n1];
			int B[] = new int[n2];
			int C[] = new int[n3];

			for (int i = 0; i < n1; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 0; i < n2; i++) {
				B[i] = sc.nextInt();
			}
			for (int i = 0; i < n3; i++) {
				C[i] = sc.nextInt();
			}

			qqqq sol = new qqqq();
			ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
			if (res.size() == 0) {
				System.out.print(-1);
			} else {
				for (int i = 0; i < res.size(); i++) {
					System.out.print(res.get(i) + " ");
				}
			}
			System.out.println();

		}
	}
}

//} Driver Code Ends

//User function Template for Java

class qqqq {
	ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
		// code here
		ArrayList<Integer> a = new ArrayList<>();
		int x = 0, y = 0, z = 0;
		while (x < A.length && y < B.length && z < C.length) {

			if (A[x] == B[y] && B[y] == C[z]) {
				if (a.contains(A[x])) {

				} else {
					a.add(A[x]);

				}
				x++;
				y++;
				z++;
			}

			else if (A[x] < B[y])
				x++;

			else if (B[y] < C[z])
				y++;

			else
				z++;
		}
//		System.out.println(a);
		return a;
	}
}