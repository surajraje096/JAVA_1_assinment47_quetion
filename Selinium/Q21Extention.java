package Selinium;

public class Q21Extention {
public static void main(String[] args) {
		
		String s = "hello.jpeg";

		int location = 0 ;
		for(int i=0;i<s.length();i++)
		{
			char c= '.';
			
			if(c==s.charAt(i))
			{
				location = i ;
			}
		}
		String ans = s.substring(location+1,s.length());
		System.out.println(ans);
		
		
		
}
}
