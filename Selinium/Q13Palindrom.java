package Selinium;

public class Q13Palindrom {
	public static void main(String[] args) {
		
		int ans = 0 ;
		for(int no=90;no<=120;no++)
		{
			int n1 = no;
			int n3 = 0;
			while(n1!=0)
			{
				int x = n1 % 10;
				n3 = (n3 * 10) + x;
				n1 = n1/10;
			}
			
			if(no==n3)
			{
				ans = ans + no;
			}
		}System.out.println(ans);
	}

}
