import java.util.*;

public class codeForces_869B_ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		if(b-a>=10)
			System.out.println("0");
		else
		{
			long f =1;
			int flag=0;
			while(b>a)
			{
				f = f*b;
				if(f%10==0)
				{
					flag=1;
					
					System.out.println("0");
					break;
				}
				b--;
			}
			if(flag==0)
			{
				
				System.out.println(f%10);
			}
				
		}
	}

}
