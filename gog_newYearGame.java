import java.util.*;

public class gog_newYearGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++)
			{
				a[i] = scan.nextInt();
			}
			long max = 0,ind=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]>max)
				{
					max = a[i];
					ind  = i;
				}
			}
			System.out.println(max+ind);
		}
	}

}
