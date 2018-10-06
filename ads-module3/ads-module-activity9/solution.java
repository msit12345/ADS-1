import java.util.*;
import twoarrays.Twoarrays;
public class solution {
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array1:");
		n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter first array1:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		System.out.println("Enter size of array2:");
		m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.println("Enter second array2:");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr2);
		Twoarrays ta=new Twoarrays();
		ta.equal(arr1,arr2);
	}

}
