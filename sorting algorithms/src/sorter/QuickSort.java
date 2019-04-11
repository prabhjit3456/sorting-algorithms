package sorter;

public class QuickSort 
{
	public static int Partition(int[] A, int start, int end) 
	{
		int pivot  = A[end];
		int pIndex = start;
		for(int i = start; i<end; i++) 
		{
			if(A[i]<=pivot) 
			{
				int temp = A[pIndex];
				A[pIndex] = A[i];
				A[i] = temp;
				pIndex++;
			}			
		}
		int temp = A[pIndex];
		A[pIndex] = A[end];
		A[end] = temp;
		return pIndex;
	}
	public static int RandomizedPartition(int[] A, int start, int end) 
	{
		int pivotIndex	= Partition(A,start,end);
		int temp  = A[pivotIndex];
		A[pivotIndex] = A[end];
		A[end] = temp;
		return Partition(A,start ,end) ;
	}
	public static void QuickSort(int[] A, int start, int end)
	{
		if(start<end) 
		{
			int partitionIndex = RandomizedPartition(A,start,end);
			QuickSort(A,start,partitionIndex-1);
			QuickSort(A,partitionIndex+1,end);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,7,4,9,6,8,1,3,5};
		int start = 0;
		int end = arr.length-1;
		QuickSort(arr,start,end);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print((arr[i])+" ");
		}		
	}	
}
