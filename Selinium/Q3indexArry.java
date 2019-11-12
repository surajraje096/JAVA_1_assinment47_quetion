package Selinium;

public class Q3indexArry {
	public static void main(String[] args) {
		
		int a[]={2,3,4,2,3};
		
				int dif = 0,location = 0 ;
				for(int i=0;i<a.length-1;i++)
				{
					int result = a[i] - a[i+1];
					
					if(dif<result)
					{
						dif = result;
						location = i;
					}
				}System.out.println(location);
				
	}

}
