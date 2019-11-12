package Selinium;

public class Q22comanElement {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		int[]b= {3,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++) {
			int no1=a[i];
			for(int j=0;j<b.length;j++) {
				int no2=b[j];
				if(no1==no2) {
					count++;
				}
			}
		}System.out.println(count*2);
	}

}
