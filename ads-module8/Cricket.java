import java.util.*;
class Cricket{
     static String a[]=new String[7];
	 static String b[]=new String[7];
     static int win[]=new int[7];
     static int loss[]=new int[7];
     static int draw[]=new int[7];
     public static void main(String args[])
        {
             Scanner sc=new Scanner(System.in);
             for(int i=0;i<6;i++)
                {
                    a[i]=sc.next();
                    for(int j=0;j<a.length;j++)
                       {
                            if(a[j]==" "&& a[j+2]==" "&& a[j+4]==" ")
                              {
                                  win[j]=Integer.parseInt(a[j+1]);
                                  loss[j]=Integer.parseInt(a[j+3]);
                                  draw[j]=Integer.parseInt(a[j+5]);
								  break;
                              }
                            b[j]=a[j];
                       }
                    System.out.println();
                }
             Cricket c=new Cricket();
             c.sort(b,win,loss,draw);
			 c.display(b);
        }
     public static void sort(String arr[],int x[],int y[],int z[])
	 {
	    for(int j=0;j<7;j++)
         {
            int min=j;
			for(int i=j;i<7;i++)
			{
				arr[i];
            if(x[min]<x[i+1]&& x[min]!=x[i+1])
              {
			      String temp=arr[i+1];
				  arr[i+1]=a[min];
				  a[min]=temp;
			  }	  
		    else if(y[min]<y[i+1]&& y[min]!=y[i+1])
              {
			      String temp=arr[i+1];
				  arr[i+1]=a[min];
				  a[min]=temp;
			  }	
			else if(z[min]<z[i+1]&& z[min]!=z[i+1])
              {
			      String temp=arr[i+1];
				  arr[i+1]=a[min];
				  a[min]=temp;
			  }	  
		    }
		 }
      }
     public static void display(String arr[])	
       {
          	int i=0;
            while(i<7)
            {
                System.out.println(arr[i]);
                 i++;
            }
       }
}	 