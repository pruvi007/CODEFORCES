import java.util.*;

public class codeForces449_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		String s = scan.next();
		StringBuilder sb = new StringBuilder(s);
		while(q-->0)
		{
			int l = scan.nextInt();
			int r = scan.nextInt();
			char x = scan.next().charAt(0);
			char x2 = scan.next().charAt(0);
			for(int i=l;i<=r;i++)
			{
				if(sb.charAt(i)==x)
					sb.setCharAt(i, x2);
			}
		}
		System.out.println(sb);
	}

}
