import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class JustTry {
	
	public static void main(String[] args) {
		
		String  a[]= {"aa","bb","cc","dd"};
		
		
		ArrayList <String> q= new ArrayList <>(Arrays.asList(a));
		
		System.out.println(q);
		Deque <Integer> w= new ArrayDeque <>();
		
		w.add(1);
		w.add(2);
		System.out.println(w);
		String ss="aaa";
		for (char i:ss.toCharArray())
		{
			System.out.println(i-'a');
		}
		
		 

		
		
		
		
	}
	
	
	static void sort(int [] a)
	{
		ArrayList <Integer> aa = new ArrayList<>();
		for(int i:a) aa.add(i);
		Collections.sort(aa);
		
		a=aa.stream().mapToInt(i -> i).toArray();
		
		
	}
	
	
	

}
