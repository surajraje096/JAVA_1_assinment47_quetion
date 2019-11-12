package Selinium;

public class Q43oddposition {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
	
				int ans = 0 ;
				for(int i=1;i<a.length;i=i+2)
				{
					ans = ans + (a[i] * i);
				}System.out.println(ans);
				
		
	}
	
	
}
