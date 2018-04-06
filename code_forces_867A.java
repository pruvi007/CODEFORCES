import java.util.*;
import java.util.regex.*;

public class code_forces_867A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		Pattern p = Pattern.compile("SF");
		Matcher m = p.matcher(s);
		int sf=0;
		while(m.find())
			sf++;
		Pattern p2 = Pattern.compile("FS");
		Matcher m2  = p2.matcher(s);
		int fs=0;
		while(m2.find())
			fs++;
		System.out.println(sf+" "+fs);
		if(fs==sf || fs>sf)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
