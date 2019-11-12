package Selinium;

public class Q6fibonaaci {
	public static void main(String[] args) {

		int first = 1;
		int sec = 1;
		int third = 0;
		int n = 3;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			third = first + sec;
			sum=sum+third;
			first = sec;
			third = sec;

		}
		System.out.println(sum);
	}
}
