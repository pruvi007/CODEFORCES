import java.util.*;

public class edu_round_32_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int sumx = 0,sumy=0;
		int moves = 0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='L')
				sumx--;
			if(s.charAt(i)=='R')
				sumx++;
			if(s.charAt(i)=='U')
				sumy++;
			if(s.charAt(i)=='D')
				sumy--;
			if(sumx == 0 && sumy==0)
			{
				moves = i+1;
				
			}
				
				
		}
		System.out.println(moves);
	}

}
