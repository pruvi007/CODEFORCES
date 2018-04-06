import java.util.*;

public class goodbye_2 {
	public static String init[];
	public static int k=0;
	public static void permute(String str, int l, int r)
    {
        if (l == r)
        {
        	init[k++]=str;
        }
           // System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
       // init[k++] = String.valueOf(charArray);
        return String.valueOf(charArray);
    }
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char a[][] = new char[n][m];
		int stx=0,sty=0,endx=0,endy=0;
		for(int i=0;i<n;i++)
		{
			String s = scan.next();
			for(int j=0;j<s.length();j++)
			{
				a[i][j]=s.charAt(j);
				if(a[i][j]=='S')
				{
					stx=i;
					sty=j;
				}
				else if(a[i][j]=='E')
				{
					endx=i;
					endy=j;
				}
			}
				
		}
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}*/
		String num = scan.next();
		
		String N = "LURD";
		init=new String[25];
		permute(N, 0, 3);
		/*for(int i=0;i<24;i++)
			System.out.println(init[i]);*/
		int k=stx,l=sty;
		//System.out.println(a[k][l]);
		int c = 0;
		for(int i=0;i<24;i++)
		{
			String d = init[i];
			k=stx;l=sty;
			for(int j=0;j<num.length();j++)
			{
				int z = num.charAt(j)-'0';
				//System.out.println(z);
				if(d.charAt(z)=='L')
				{
					if((l-1)>=0)
						l=l-1;
					else if((l-1)<0)
						break;
					if(a[k][l]=='E')
					{
						c++;
						break;
					}
					if(a[k][l] == '#')
						break;
				}
				if(d.charAt(z)=='R')
				{
					if((l+1)<m)
						l=l+1;
					else if((l+1)>=m)
						break;
					
					if(a[k][l]=='E')
					{
						c++;
						break;
					}
					if(a[k][l] == '#')
						break;
				}
				if(d.charAt(z)=='U')
				{
					if((k+1)<n)
						k=k+1;
					else if((k+1)>=n)
						break;
					if(a[k][l]=='E')
					{
						c++;
						break;
					}
					if(a[k][l] == '#')
						break;
				}
				if(d.charAt(z)=='D')
				{
					if((k-1)>=0)
						k=k-1;
					else if((k-1)<0)
						break;
					if(a[k][l]=='E')
					{
						c++;
						break;
					}
					if(a[k][l] == '#')
						break;
				}
			}
		}
		System.out.println(c);
		
	}

}
