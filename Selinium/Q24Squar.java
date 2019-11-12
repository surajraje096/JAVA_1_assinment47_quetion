package Selinium;

public class Q24Squar {
public static void main(String[] args) {
		

		int a[]={1,2,3,4};

		int ans= 0 ;
		for(int i=0;i<a.length;i++)
		{
			int k = i ;
			if(k%2==0)
			{
				double no = (double) a[i];
				ans = ans + (int) Math.pow(no,2);
			}
			else
			{
				double no = (double) a[i];
				ans = ans + (int) Math.pow(no,3);
			}
		}
		System.out.println(ans);
		
		
		
		
}	
}
