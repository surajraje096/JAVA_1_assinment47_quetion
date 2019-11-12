package Selinium;

import java.util.Scanner;

public class Q45NONprime {
	   public static int listOfPrimeNum(int num)
	      {
	    	boolean flag;
	    	int sum=0;
	  		for(int n=2;n<=num;n++)
	  		{
	  			flag=false;
	  			for(int i=2;i<=n/2;i++)
	  			{
	  				if(n%i==0)
	  				{   sum+=n;
	  				
	  					flag=true;
	  					break;
	  					
	  				}
	  			}
	  			if(!flag)
	  				System.out.print(n+" ");
	  		}
	  		return sum;
	      }
		

		 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number :");
			int num=sc.nextInt();
			System.out.println("\nSum of Non Prime "+listOfPrimeNum(num));
			
			
		}

	}


