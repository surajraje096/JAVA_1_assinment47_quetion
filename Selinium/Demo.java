package Selinium;

import java.util.Scanner;

public class Demo {

	/*
	 *
	 * * * *
	 */

	public static void main(String[] args) {

	/*	int a = 3;
		for (int i = 1; i < a; i++) {
			for (int p = 0; p <= a; p++) {
				System.out.print("*");
				{
					
				}
				System.out.println();

			}

		}
*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");

		String name = sc.nextLine();
		System.out.println("You have enter the string : " + name);

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}
		System.out.println("Reverse of the given String is: " + reverse);

		if (name.equals(reverse)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}
        
		for (int j=0;j<name.length();j++){ 
		ch = name.charAt(j);

		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
		ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			vowels ++;
		
	}
		System.out.println("Total number of vowels in the string is: " +vowels);
		
	}

}
