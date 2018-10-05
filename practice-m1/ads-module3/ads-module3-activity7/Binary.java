package binary;

public class Binary 
{
	 public int binarySearch(int arr[], int x) 
	    { 
	        int l = 0, r = arr.length-1; 
	        while (l <= r) 
	        { 
	            int m = l + (r-l)/2; 
			      if(arr[m] == x && arr[m-1]==x) 
				return m-1;
	            if (arr[m] < x) 
	                l = m + 1; 
	            else
	                r = m - 1; 
	        } 
	        return -1; 
	    } 
}
