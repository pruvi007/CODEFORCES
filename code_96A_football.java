import java.util.*;

public class code_96A_football {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int c1=0,c2=0,flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				c1++;
				c2=0;
			}
			if(c1>=7)
			{
				flag=1;
				break;
			}
			else if(s.charAt(i)=='1')
			{
				c2++;
				c1=0;
			}
			if(c2>=7)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
