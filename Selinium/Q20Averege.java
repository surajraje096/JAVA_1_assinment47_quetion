package Selinium;

public class Q20Averege {
public static void main(String[] args) {
		
		int a[] =  {1,2,3,4,5,6,7,8,9,10}; 
        int ans = 0 ;
		for(int i=2;i<a.length;i++)
		{
			int count = 0 ;
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			
			if(count==0)
			{
				ans = ans + a[i];
			}
		}System.out.println(ans);
		

}
}