package hackerrth;

import java.util.ArrayList;
import java.util.Scanner;

public class IsAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        int count [] = new int [300];
        char aa[]=a .toLowerCase().toCharArray();
        char bb[]=b.toCharArray();
//        System.out.println(aa);
        for(int i=0;i<a .length();i++)
        {
        	int q=aa[i];
            
//             System.out.println(q);
            
            count[q]++;
            
            int w=bb[i];
            
            
//             System.out.println(w);
            
            count[w]--;
            
        }
        
        for(int i=0;i<count.length;i++)
        {
        	if (count[i]!=0)
        	{
        		System.out.println(i);
        		return false;
        	}
        }
        
        
        
        return true;
        
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = "Sa";//scan.next();
        String b = "as";//scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        ArrayList <Integer >  ww = new ArrayList<Integer>();
        
        
       
        
    }
}
