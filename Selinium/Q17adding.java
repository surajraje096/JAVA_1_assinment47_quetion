package Selinium;

public class Q17adding {

	public static void main(String[] args) {
/*		int array[] = {1,2,3,4,5};
		int sum= 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0)
				
				sum+=array[i]*array[i];
			else
				sum +=array[i]*array[i]*array[i];
			
		}
		System.out.println(sum);

	}*/

		
		int num=125;
		int sum=0;
		int temp;
		while(num>0) {
			
						//Actual number 125
			temp=num%10;//last digit ex--5
			num=num/10; // remanning digit ex--12
			
			sum=sum+(temp*temp);
			
			
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
}
}