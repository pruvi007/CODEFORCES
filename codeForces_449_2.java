import java.util.*;

public class codeForces_449_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long p = scan.nextLong();
		long sum = 0,c=0;
		for(int i=11;;i++)
		{
			int k = i;
			while(k>0)
			{
				int rem = k%10;
				if(rem==0)
				{
					k=k/10;
				}
				else
					break;
			}
			int k2 = k;
			int l = 0;
			while(k2>0)
			{
				l++;
				k2=k2/10;
			}
			if(l%2==0)
			{
				int a[] = new int[l];
				int k3 = k,z=0;
				
				while(k3>0)
				{
					a[z++] = k3%10;
					k3/=10;
				}
				int flag=0;
				for(int j=0;j<z;j++)
				{
					if(a[j]!=a[z-j-1])
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					c++;
					sum = sum + k;
					if(c==n)
						break;
				}
			}
			
		}
		long ans = sum%p;
		System.out.println(ans);
	}

}
