import java.util.*;
class SentinalInsertion{
    public static void sort(char array[]) 
	{  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            char key = array[j];  
            int i = j;  
            while ( (i > 0) && ( array [i-1] > key ) ) {  
                array [i] = array [i-1];  
                i--;  
				System.out.print(array[i]);
            }  
            array[i] = key; 
            System.out.println(array[i]);			
        } 
	}	
}	
public class Solution{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s;
	  int n;
	  System.out.println("No. of test cases:");
	  n=sc.nextInt();
	  for(int b=0;b<n;b++)
	  {
	  System.out.println("Enter the string:");
	  s=sc.next();
	  int m=s.length();
	  char[] a=new char[m];
	  for(int i=0;i<m;i++)
	  {
		 a[i]=s.charAt(i);
	  }	 
	  SentinalInsertion si=new SentinalInsertion();
	  System.out.println("before insertion sort");
	  System.out.println(a);
	  si.sort(a);
	  System.out.println("After Insertion Sort");    
        for(char i:a){    
            System.out.print(i+" ");
                        }
						System.out.println();
	  }
   }				
}	