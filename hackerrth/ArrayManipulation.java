package hackerrth;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'arrayManipulation' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY queries
	 */

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Write your code here

		long ans = 0;
		long aa[] = new long [n+1];

		
		
		

		for (int i = 0; i < queries.size(); i++) {
			List<Integer> q = queries.get(i);

			int s = q.get(0);
			int e = q.get(1);
			int add = q.get(2);

			
			aa[s-1]+=add;
			aa[e]-=add;
			
			
			

		}
		
		for(int i=1;i<aa.length;i++)
		{
			
			aa[i]+=aa[i-1];
			
			if (aa[i]>ans)
			{
				ans =aa[i];
			}
		}
		
		
		return ans;

	}

}

public class ArrayManipulation {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, m).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		long result = Result.arrayManipulation(n, queries);
System.out.println(result);
		
	}
}
