package Selinium;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q12time {
	public static void main(String[] args) {

		 String n = "09:36 PM";
		 String a[]=n.split(":");		
		 int h = Integer.parseInt(a[0]);
		 String x = a[1];	String r = "";
		 for(int i=0;i<=1;i++)
		 {
			 r=r+x.charAt(i);
		 }
		 int m = Integer.parseInt(r);
		 
		 String j = DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.of(h,m));
		 
		 if(n.equalsIgnoreCase(j))
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("False");
		 }
		
		
	}

}
