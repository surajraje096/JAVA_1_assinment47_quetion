package Selinium;

public class Q37encription {
	public static void main(String[] args) {
		

		String s = "surajaz";

		String n = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				if(s.charAt(i)=='z')
				{
					n= n + "a";
				}
				else
				{
					int no =((int) s.charAt(i))+1;
					char c = (char) no;
					n = n + c;
				}
				
			}
			else
			{
				n= n + s.charAt(i);
			}
		}
		System.out.println(n);
		
	}

}
