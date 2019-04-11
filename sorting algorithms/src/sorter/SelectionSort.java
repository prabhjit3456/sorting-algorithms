package sorter;

public class SelectionSort 
{
	private static void selectionSort(int[] A) 
	{
		for(int i = 0; i<A.length-1;i++) 
		{
			int min = i;
			for(int j = i+1; j<A.length;j++) 
			{
				if(A[j]<A[min]) 
				{
					min = j;
				}
			}
			int temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}		
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,7,4,9,8,1,3,5};
		selectionSort(arr);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print((arr[i])+" ");
		}		
	}	
}
