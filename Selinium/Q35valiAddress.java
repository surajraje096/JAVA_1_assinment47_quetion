package Selinium;

import java.util.StringTokenizer;

public class Q35valiAddress {

	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("10.99.51.100",".");
		
				int count = 0 ;
				while(s.hasMoreTokens())
				{
					String n = s.nextToken().toString();
					
					int no = Integer.parseInt(n);
					if(no>=0 && no<=255)
					{
						count++;
					}
				}
				if(count==4)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}

	}

}
