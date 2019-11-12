package Selinium;

public class Q3LargeElement {
public static void main(String[] args) {
	  int a[]= {2,3,4,2,3};
	  
	  int index= 0;
	  int location= 0;
	  for(int i=0;i<a.length-1;i++) {
		  int ans= a[i]-a[i+1];
		  if(index<ans) 
		  {
			  index=ans;
			  location=i;
			  
		  }
	  }System.out.println(location);
	  
	  
}
}
