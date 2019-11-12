package Selinium;

public class Q34maximam {

	public static void main(String[] args) {
	
		int a[] = {3,8,4,3,8,1,8};
		int avg1 = 0 , avg2 = 0 ,value = 6;
		int count=0; int count1=0;
		
		for(int i=0;i<a.length;i++)
		{
			int no = a[i];
			
			if(value>no)
			{
				avg1 = avg1 + no;
				count++;
			}
			else
			{
				avg2 = avg2 + no;
				count1++;
			}
		}
		
		System.out.println(avg1/count);
		System.out.println(avg2/count1);
		
		

	}

}
