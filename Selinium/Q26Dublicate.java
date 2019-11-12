package Selinium;

import java.util.LinkedHashSet;

public class Q26Dublicate {
	public static void main(String[] args) {
		String a="hello";
		String ans="";
		LinkedHashSet<Character>hm=new LinkedHashSet<>();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			hm.add(c);
		}
		for(char j:hm) {
			ans=ans+j;
		}
		System.out.println(ans);

		
	}
		

}
