import java.util.*;
public class Solution{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String expressions=sc.next();
		System.out.println(Balanced(expression));
	}
    public static String Balanced(String a)
    {
      Stack<Integer> s = new Stack<Integer> ();
		Scanner tokens = new Scanner(exp);
		while (tokens.hasNext()) {
			if (tokens.hasNextInt()) {
				s.push(tokens.nextInt());
			}
            else{
                   String a=s.pop();
                   String b=s.pop();
                   if(a=='{' || a=='[' || a='(' && b='}' || b=']' || b='(')
					   {
                           String c= "balanced";
						   return c;
					   }						   
			    }
		}
	}
}	