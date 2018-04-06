import java.util.*;

public class edu_round_32_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		int c = 0;
		for(int i=1;i<n-1;i++)
		{
			if((a[i]>a[i-1] && a[i]>a[i+1]) || (a[i]<a[i-1] && a[i]<a[i+1]))
				c++;
		}
		System.out.println(c);
	}

}
