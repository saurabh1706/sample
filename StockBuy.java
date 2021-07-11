
public class StockBuy {
	public static void main(String[] args) {
		
		int []prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
		
	}


    private static int maxProfit(int[] a) {
        int maxProft=0,minSoFar=a[0];
        for(int i:a)
        {
            minSoFar=Math.min(minSoFar,i);
            maxProft=Math.max(maxProft, (i-minSoFar) );
            
        }
        
        return maxProft;
        
    }
}
