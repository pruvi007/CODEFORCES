import java.util.*;

public class codeForces_71A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = scan.next();
			if(s.length()>10)
			{
				System.out.print(s.charAt(0));
				System.out.print(s.length()-2);
				System.out.println(s.charAt(s.length()-1));
			}
			else
				System.out.println(s);
		}
	}

}
