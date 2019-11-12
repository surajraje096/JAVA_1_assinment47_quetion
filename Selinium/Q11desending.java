package Selinium;

import java.util.Arrays;
import java.util.Collections;

public class Q11desending {
	public static void main(String[] args) {
		String s[]={"ga","yb","awe"};
		String x = "awe";		int location = 0;
		Arrays.sort(s,Collections.reverseOrder());
		
		for(int i=0;i<s.length;i++)
		{
			String a = s[i];
			if(x.equals(a))
			{
				location = i;
			}
			
		}System.out.println(location);

}
} 