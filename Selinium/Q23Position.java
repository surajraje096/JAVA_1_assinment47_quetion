package Selinium;

public class Q23Position {
	public static void main(String[] args) {
		
		String s = "hh--ww--";
		String s1 = "--yy--ru";
		int sa[]= new int[s.length()];			int index= 0 ;
		int s1a[] = new int[s1.length()];		int index1=0;
		char c = '-';
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				sa[index] = i;
				index++;
			}
		}
		
		for(int i=0;i<s1.length();i++)
		{
			if(c==s1.charAt(i))
			{
				s1a[index1] = i;
				index1++;
			}
		}

		
		int ans = 0 ;
		
		for(int i=0;i<index;i++)
		{
			if(sa[i]==s1a[i])
			{
				ans++;
			}
		}
		
		if(index==ans)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
	}
}
