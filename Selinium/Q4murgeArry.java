package Selinium;

public class Q4murgeArry {
	public static void main(String[] args) {
		int a []= {1,2,3,4};
		int b[]= {3,4,5,6};
		int c[]=new int[a.length+b.length];
		
		int location=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c[location]=a[i];
					location++;
				}
			}
		}
		
		for(int i=0;i<c.length;i++) {
			int temp=c[i];
			sum=sum+temp;
		}
		System.out.println(sum);
		
		
	}

}
