package equal;
import java.util.*;
public class Equalpair
{
   private Scanner sc;

public void pair(int n)
   {
   int  a[]=new int[n];
	int count=0;
	System.out.print("Enter the array:");
	sc = new Scanner(System.in);
	for(int i=0;i<n;i++) // entering array elements
	{
		a[i]=sc.nextInt();
	}
   Arrays.sort(a); // array sorting
	for(int i=0;i<n;i++) // entering array elements
	{
	   System.out.println(a[i]);
	}
	int j=a[0];
	for(int i=0;i<n;i++) // checking for equal pairs
	{
			if(a[i]==j)
			{
				count++;
			}
			j=a[i];
    }
	System.out.println("count is:"+count);
	}
}	