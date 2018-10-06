import java.util.*;
import threesum.Threesum;
public class solution {
	public static void main(String[] args) {
		Threesum ts=new Threesum();
		int n;
		System.out.println("Enter size:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter an array:");
        for(int i=0;i<n;i++)
        {
			a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        ts.search(a);
	}
}
