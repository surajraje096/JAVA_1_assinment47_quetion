package Selinium;

public class Q21CommanElement {
public static void main(String[] args) {
		
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};

		int count = 0 ;
		for(int i=0;i<a.length;i++)
		{
			int x = a[i];
			
			for(int j=0;j<b.length;j++)
			{
				int y = b[j];
				
				if(x==y)
				{
					count++;
				}
			}
		}System.out.println((count*2));
}
}
