import java.util.*;

public class almost_difference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++)
			a[i] = scan.nextLong();
	
		long sum=0;
		int flag[] = new int[n];
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[j]-a[i])>1)
				{
					sum = sum + a[j]-a[i];
					
				
				}
					
			}
		}
		System.out.println(sum);
	}

}
