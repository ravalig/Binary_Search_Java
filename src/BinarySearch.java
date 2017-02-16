
public class BinarySearch {
	
	public static int binarySearch(int[] a, int key){
		int low = 0;
		int high = a.length;
		int mid; 
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if(key == a[mid])
				return mid;
			else if(key > mid)
			{
				low = mid +1;
			}
			else
			{
				high = mid-1;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,8,10,22,35,37,98};
		int result = binarySearch(arr, 22);
		if(result != 0){
			System.out.print("Value exists at position " + result );
		}
	}

}
