import java.util.Scanner;
class AddLargeNumbers {
    public static LinkedList numberToDigits(String number) {
		long a=(long)number;
		String s;
		 while(a/10!=0)
		 {
			 a=a%10;
			 s=(String)a;
			 LinkedList<String> ll=new LinkedList<String>();
			 ll.add(s);
			 a=a/10;
			 Iterator it=ll.Iterator();
			 while(it.hasNext())
			 {
				 System.out.println(ll.next());
			 }			 
		 }
		 return ll;
    }
    public static String digitsToNumber(LinkedList list) {
		long a=(long)number;
		String s;
		 while(a/10!=0)
		 {
			 a=a%10;
			 s=(String)a;
			 LinkedList<String> ll=new LinkedList<String>();
			 ll.add(s);
			 a=a/10;
			 Iterator it=ll.Iterator();
			 while(it.hasNext())
			 {
				 System.out.println(ll.next());
			 }
		 }	 
          return s;
    }
    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		LinkedList list3[]=new LinkedList[(list1.length+list2.length)/2]
       Stack<LinkedList> st1=new Stack<LinkedList>();
	   Stack<LinkedList> st2=new Stack<LinkedList>();
	   st1.add(list1);
	   st2.add(list2);
	   for(int i=0;i<st1.length && i<st2.length;i++)
	   {
		   
	   }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;
            case "addLargeNumbers":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    } 
}
