import java.util.*;
public class edu_roud_31_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int a[] = new int[n];
		int sum = 0,ans=0;
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
			int rem = 86400 - a[i];
			sum = sum + rem;
			if(sum>=t)
			{
				ans = i;
				break;
			}
		}
		System.out.println(ans+1);
	}

}
