
public class MergeSort {
	 
	public static void main(String[] args) {
		int []a = {7,1,5,3,6,4,2};
		
		printArray(a);
		MergeSort m = new MergeSort();
		m.mergeSort(a,0,a.length-1);
		printArray(a);
		
		
		
	}
	static void  printArray(int []a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");

		}
		System.out.println();
	}
	
	void mergeSort(int []a, int low, int high)
	{
		int mid =(low+high)/2;
		
		if (low<high)
		{
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a,low,mid,high);
		}	
				
		
	}
	
	

	
	void merge(int arr[], int low, int mid, int high)
	{
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;
 
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
 
		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];
 
		/* Merge the temp arrays */
 
		// Initial indexes of first and second subarrays
		int i = 0, j = 0;
 
		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
 
		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
 
		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
