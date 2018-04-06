import java.util.*;

public class UslsToy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char a = s.charAt(0);
		char b = s.charAt(2);
		long n = scan.nextLong();
		int k = (int)n%4;
		char z[] = {'v','<','^','>'};
		
			int ina=0,inb=0;
			char x=a;
			for(int i=0;i<4;i++)
			{
				if(z[i]==a)
				{
					ina = i;
					break;
				}
			}
			for(int i=0;i<4;i++)
			{
				if(z[i]==b)
				{
					inb = i;
					break;
				}
			}
			int dif=inb-ina;
			dif=Math.abs(dif);
			if(dif==k)
			{
				if(ina>inb)
					System.out.println("ccw");
				else
					System.out.println("cw");
			}
			else
				System.out.println("undefined");
			
	}

}
