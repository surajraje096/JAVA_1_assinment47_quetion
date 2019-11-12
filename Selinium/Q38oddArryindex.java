package Selinium;

public class Q38oddArryindex {

	public static void main(String[] args) {

		int a[]={2,2,9,6,1,9,7};
	
				int max=0;
				for(int i=1;i<a.length;i=i+2)
				{
					if(max<a[i])
					{
						max = a[i];
					}
				}System.out.println(max);
				
		

	}

}
