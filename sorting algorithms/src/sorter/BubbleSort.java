package sorter;

public class BubbleSort 
{
	private static void BubbleSort(int[] A) 
	{
		for(int i = 0; i<A.length-1;i++) 
		{
			int min = i;
			for(int j =0; j<A.length-i-1;j++) 
			{
				if(A[j]>A[j+1]) 
				{
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}			
		}		
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,7,4,9,8,1,3,5};
		BubbleSort(arr);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print((arr[i])+" ");
		}		
	}
		
}
