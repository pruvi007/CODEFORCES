import java.util.*;

public class edu_35_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int p[] = new int[n];
		if(a<n && b<n)
			System.out.println("1");
		else
		{
			int c =n-1;
			int part = 0;
			if(a>=n && a>=b)
			{
				while(true)
				{
					if(a%c==0)
					{
						part = c;
						break;
					}
					c--;
				}
				//System.out.println(part);
			int a1 =a/part;
			if(part==n)
				n=1;
			else n=n-part;
			int a2 = b/(n);
			if(a2==0)
				System.out.println("1");
			else
			{
				int ans = a1>a2?a2:a1;
				System.out.println(ans);
			}
			
				
			}
			else if(b>=n && b>=a)
			{
				while(true)
				{
					if(b%c==0)
					{
						part = c;
						break;
					}
					c--;
				}
				//System.out.println(part);
				int a1 =b/(part);
				if(part==n)
					n=1;
				else n=n-part;
				int a2 = a/(n);
				if(a2==0)
					System.out.println("1");
				else
				{
					int ans = a1>a2?a2:a1;
					System.out.println(ans);
					
				}
				
			}
			
		}
	}

}
