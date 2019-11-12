package Selinium;

import java.util.Scanner;

public class Q1sumodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		int add=0;
		while(no!=0) {
			int rem = no % 10;//3
			if(rem%2!=0) {
				add=add+rem;//3
			}
			no = no/10;
		}
		if(add%2==0) {
			System.out.println("-1");
			
		}else {
			System.out.println("1");
		}
		
	}
}