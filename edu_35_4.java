import java.util.*;
public class edu_35_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = scan.nextInt();
		int q = scan.nextInt();
		while(q-->0)
		{
			int l = scan.nextInt();
			int r= scan.nextInt();
			int b[] = new int[n];
			int k=0;
			for(int i=0;i<l-1;i++)
				b[k++]=a[i];
			for(int i=r-1;i>=l-1;i--)
				b[k++]=a[i];
			for(int i=r;i<n;i++)
				b[k++]=a[i];
			int c=0;
			/*for(int i=0;i<n;i++)
				System.out.print(b[i]+" ");*/
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(b[i]>b[j])
						c++;
				}
			}
			//System.out.println();
			//System.out.println(c);
			if(c%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}

}
