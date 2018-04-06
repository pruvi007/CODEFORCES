import java.util.*;
public class goodbye_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' 
					|| s.charAt(i)=='o' || s.charAt(i)=='u')
					{
						c++;
					}
			if(s.charAt(i)=='1' || s.charAt(i)=='3' || s.charAt(i)=='5' || 
					s.charAt(i)=='7' || s.charAt(i)=='9')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
