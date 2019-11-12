package Selinium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Q28arrystring {
	public static void main(String[] args) {
		String s[]= {"aaa","bb","cccc","d"};
		String s1="bb";
		int ans=0;
		for(int i=0;i<s.length;i++)
		{
			if(s1.length()!=s[i].length()) {
				ans++;
			}
		
		}
		
		System.out.println(ans);
		
		
		
		
	/*	ArrayList<String>a=new ArrayList();
		a.add("aaa");
		a.add("bb");
		a.add("cccc");
		a.add("d");
		String str="bb";
		int count=0;
		Iterator<String>i=a.iterator();
		while(i.hasNext()){
			String temp=i.next();
			if(temp.length()!=str.length()) {
				count++;
			}
		System.out.println(count);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
