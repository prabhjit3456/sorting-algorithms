package sorter;

public class MergeSort 
{
	public static void Merge(int[] A,int[] left,int []right) 
	{
	    int i = 0,j=0, k =0;
		while(i <left.length&&j <right.length) 
		{
			if(left[i]<right[j]) 
			{
				A[k] = left[i];
				i++;
			}
			else 
			{
				A[k] = right[j];
				j++;
			}
			k++;			
		}
		
		while(i<left.length) 
		{
			A[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length) 
		{
			A[k] = right[j];
			j++;
			k++;
		}		
	}
	public static void MergeSort(int[] A) 
	{
		if(A.length==1) 
		{
			return ;		
		}
        // assert A.length >= 2		
		int leftLength = A.length/2;  // 1
		int rightLength = A.length - leftLength;  // 2
		//int trueLength = A.length;
		int []left = new int[leftLength];
	    int [] right  =new int[rightLength];
	    for(int f = 0;f<leftLength;f++) 
	    {
	    	left[f] = A[f];
	    } 		
		for(int r =0; r<rightLength;r++) 
		{
			right[r] = A[r+leftLength];
		}		
		MergeSort(left);
		MergeSort(right);
		Merge(A,left,right);
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,7,4,9,6,8,1,3,5};
		MergeSort(arr);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print((arr[i])+" ");
		}		
	}	
}
