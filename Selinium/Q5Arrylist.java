package Selinium;

public class Q5Arrylist {

	public static void main(String[] args) {
		
		int a[] = {12,1,32,3};
		int b[] = {0,12,2,23};
		int c []=new int[a.length+b.length];
		int location =0;
		
		
	for(int i=1;i<a.length;i=i+2) {
		
		  c[i]=a[i];
		 location++;
	}
	for(int i=0; i<b.length;i=i+2) {
		c[i]=b[i];
		location++;
	}
	for(int i=0; i<location;i++) {
		System.out.println(c[i]);
	}
		
		

	}

}
