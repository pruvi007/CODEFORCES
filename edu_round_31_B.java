import java.util.*;

public class edu_round_31_B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x = scan.nextLong();
		int a[] = new int[n];
		long sum = 0;
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
			sum = sum + a[i];
		}
		if(sum+ n-1 == x)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
	}

}
