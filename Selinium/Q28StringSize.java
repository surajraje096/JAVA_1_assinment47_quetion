package Selinium;

import java.util.StringTokenizer;

public class Q28StringSize {
public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("AAA/abb/CCC","/");

		int index = 0 ;			
		
		String n[] = new String[st.countTokens()];
		
		while(st.hasMoreTokens())
		{
			String j = st.nextToken();
			StringBuffer sb = new StringBuffer(j);
			sb.reverse();
			
			String k = sb.toString().toLowerCase();
			n[index] = k ;
			index++;
			
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.println(n[i]);
		}
}
}
