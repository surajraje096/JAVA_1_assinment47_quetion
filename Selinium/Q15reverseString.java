package Selinium;

import java.util.Scanner;

public class Q15reverseString {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String st= s.next();
		
		String ans="";
		
		
		for (int i=st.length()-1;i>=0;i-- ) {
			char c=st.charAt(i);
			ans=ans+c+"-";
			
		}
		System.out.println(ans.substring(0,ans.length()-1));
		
	}

}
