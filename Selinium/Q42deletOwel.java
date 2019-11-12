package Selinium;

public class Q42deletOwel {
	public static void main(String[] args) {
		
		String s = "commitment";
		String n = s.substring(1,s.length());
				String j = "";
				for(int i=0;i<n.length();i++)
				{
					if(i%2==0)
					{
						if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u')
						{
							j = n ;
						}
						else
						{
							j = j + n.charAt(i);
						}
					}
					else
					{
						j = j + n.charAt(i);
					}
				}String ans = s.charAt(0) + j ;
				System.out.println(ans);
			
	}

}
