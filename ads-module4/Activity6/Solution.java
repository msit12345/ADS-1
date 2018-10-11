import java.util.*;
public class Solution {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp=sc.next();
        System.out.println(postfixEvaluate(exp));               
    }
    public static int postfixEvaluate(String exp) {
	 	Stack<Integer> s = new Stack<Integer> ();
		Scanner tokens = new Scanner(exp);
		while (tokens.hasNext()) {
			if (tokens.hasNextInt()) {
				s.push(tokens.nextInt());
			} else {
				int num2 = s.pop();
				int num1 = s.pop();
				String op = tokens.next();
				if (op=='*' || op=='-' || op='+' || op=='/'  || op='%'||)
					{
					s.push(num1 op num2);
				}
			}
		}
		return s.pop();
    }
}