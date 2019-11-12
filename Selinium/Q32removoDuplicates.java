package Selinium;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q32removoDuplicates {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.nextLine();
		String n = "";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			hs.add(c);
		}
		
		for(char j : hs)
		{
			n = n + j;
		}System.out.println(n);
		
	}

}
