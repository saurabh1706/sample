/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here

		Scanner sc = new Scanner(System.in);
		int[] a = new int[28];
		String V = sc.next();

		for (char i : V.toCharArray()) {
			a[i - 'a']++;
		}

		int n = sc.nextInt();
		while (n-- > 0) {
			System.out.println(n+ " n");
			boolean flag = true;

			char[] c = new char[a.length];
			c = V.toCharArray();

			String b = sc.next();
			int count=0;

			for (char e : V.toCharArray()) {
				for (char d : b.toCharArray()) {
					
					
					if (d==e)
					{
						count++;
						System.out.println(d+" d");
						break;
					}

				}
			}
			
			if (count !=b.length())
			{
				flag=false;
			}

			if (flag) {
				System.out.println("POSITIVE");
			} else {
				System.out.println("NEGATIVE");
			}

		}

	}
}
