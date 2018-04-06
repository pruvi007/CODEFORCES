import java.util.*;

public class codeForces_441_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long i=n;
		long c=0;
		ArrayList<Long> a = new ArrayList<Long>();
		int b = 0;
		while(i>0)
		{
			long k = i;
			long sum = i;
			while(k>0)
			{
				long rem = k%10;
				sum = sum + rem;
				k=k/10;
			}
			if(sum == n)
			{
				c++;
				a.add(i);
			}
			b++;
			if(b==100)
				break;
			i--;
		}
		System.out.println(c);
		for(int z = a.size()-1;z>=0;z--)
			System.out.println(a.get(z));
	}

}
