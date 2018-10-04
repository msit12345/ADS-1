import binary.Binary;
import java.util.*;
public class solution {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary ob = new Binary(); 
		 int n;
		 sc = new Scanner(System.in);
		 System.out.println("Enter size:");
		 n=sc.nextInt();
       int a[] =new int[n]; 
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}	
		Arrays.sort(a);
		System.out.println("Enter searching element:");
       int x=sc.nextInt(); 
       int result = ob.binarySearch(a, x); 
       if (result == -1) 
           System.out.println("Element not present"); 
       else
           System.out.println("Element found at " + "index " + result); 
	}
}