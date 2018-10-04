
import equal.Equalpair;
import java.util.*;
public class solution {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		n=sc.nextInt();
		Equalpair eq=new Equalpair();
		eq.pair(n);
	}

}
