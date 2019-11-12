package Selinium;

public class Q36consecutive {
	public static void main(String[] args) {
		

		String s = "AAxAyzaa";
		int count = 0 ;
		for(int i=0;i<s.length()-2;i++)
		{
			
			if((s.charAt(i)==s.charAt(i+1)) && (s.charAt(i)==s.charAt(i+2)))
			{
				count++;
				if(count>=1)
				{
					System.out.println("1");
				}break;
			}
		}	
			
			if(count==0)
			{
				System.out.println("-1");
			}
		
		
		
	}

}
