import java.util.*;

public class divisibility_difference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int m = scan.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++)
			a[i] = scan.nextLong();
		int f[] = new int[m];
		for(int i=0;i<n;i++)
		{
			int x = (int)a[i]%m;
			f[x]++;
		}
		/*for(int i=0;i<m;i++)
			System.out.print(f[i]+" ");*/
		int flag=0,ind=0;
		for(int i=0;i<m;i++)
		{
			if(f[i]>=k)
			{
				ind = i;
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("No");
		else
		{
			System.out.println("Yes");
			int c=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]%m==ind)
				{
					c++;
					if(c<=k)
						System.out.print(a[i]+" ");
				}
			}
		}
	}

}
