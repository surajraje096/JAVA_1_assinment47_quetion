package Selinium;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q9Differancedate {
	public static void main(String[] args) {
		String n = "2012-12-01";			String j = "2012-01-03";
	
				LocalDate d = LocalDate.of(2013,10,01);
				LocalDate x = LocalDate.of(2012,01,01);
				
				System.out.println(ChronoUnit.MONTHS.between(x,d));
				
				
		
		
		
	}

}
