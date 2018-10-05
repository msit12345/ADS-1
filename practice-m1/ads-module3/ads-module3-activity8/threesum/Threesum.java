package threesum;
import java.util.*;
public class Threesum 
{
  public void search(int arr[])
  {
	  int count=0,x;
	  System.out.println("Enter any value:");
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  for(int i=0;i<arr.length-2;i++)
	  {
		  for(int j=i+1;j<arr.length-1;j++)
		  {
			  for(int k=j+1;k<arr.length;k++)
			  {
				  if(arr[i]+arr[j]+arr[k]==x)
				  {
					  //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					  //break;
					  count++;
				  }  
			  }
		  }
	  }
	 System.out.println(count); 
  }
}
