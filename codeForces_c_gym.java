import java.util.*;

public class codeForces_c_gym {
	public static ArrayList<Long> ar=new ArrayList<Long>();
	public static long GCD(long a,long b)
	{
		if(b==0)
		{
			return a;
		}
			
		else
		{
			return GCD(b,a%b);
		}
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long g = GCD(a,b);
		//System.out.println("GCD: "+g);
		for(int i=2;i<=g;i++)
		{
			if(g%i==0)
				ar.add((long)i);
		}
		
		//for(int i=0;i<ar.size();i++)
			//System.out.print(ar.get(i)+" ");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			long l = scan.nextInt();
			long r = scan.nextInt();
			int flag=0;
			for(int j=0;j<ar.size();j++)
			{
				if(ar.get(j)>=l && ar.get(j)<=r)
				{
					flag=1;
					System.out.println(ar.get(j));
					break;
				}
			}
			if(flag==0)
				System.out.println("-1");
			
		}
	}

}
