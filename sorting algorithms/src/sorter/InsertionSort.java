package sorter;

public class InsertionSort 
{
	private static void InsertionSort(int[] A) 
	{
		 int  key, j; 
		    for (int i = 1; i < A.length; i++) 
		    { 
		        key = A[i]; 
		        j = i - 1; 
		  
		        /* Move elements of arr[0..i-1], that are 
		          greater than key, to one position ahead 
		          of their current position */
		        while (j >= 0 && A[j] > key) 
		        { 
		            A[j + 1] = A[j]; 
		            j = j - 1; 
		        } 
		        A[j + 1] = key;
		     }			        		
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,7,4,9,8,1,3,5};
		InsertionSort(arr);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print((arr[i])+" ");
		}		
	}
		
}
