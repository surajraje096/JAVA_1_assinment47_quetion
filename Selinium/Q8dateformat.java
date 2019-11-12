package Selinium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class Q8dateformat {

	public static void main(String[] args) throws ParseException {
		String n = "01/23/2012";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date dt1 = sdf.parse(n);

		sdf = new SimpleDateFormat("MMMM"+" "+"YYYY");
		System.out.println(sdf.format(dt1));
		
	}

}
