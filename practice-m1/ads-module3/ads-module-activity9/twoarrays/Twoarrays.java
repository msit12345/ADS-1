package twoarrays;
import java.util.*;
public class Twoarrays 
{
    public void equal(int arr1[],int arr2[])
    { 
    	int arr3[]=new int[(arr1.length+arr2.length)/2];
    	int i,j,k=0;
    	for(i=0;i<arr1.length;i++)
    	{
    		for(j=0;j<arr2.length;j++)
    		{
    			if(arr1[i]==arr2[j])
    			{
    				arr3[k]=arr1[i];
    				k++;
    			}
    		}	
    	}
    	Arrays.sort(arr3);
    	System.out.println("Sorted array:");
    	for(i=0;i<arr3.length;i++)
    	{
    		System.out.println(arr3[i]);
    	}
    }
}