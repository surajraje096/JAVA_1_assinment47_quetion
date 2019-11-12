package Selinium;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2Dateformat {
	public static void main(String[] args) throws ParseException {
		
		String s ="12-27-2012";
		SimpleDateFormat sm= new SimpleDateFormat("mm-dd-yyyy");
		Date d= sm.parse(s);
		sm =new SimpleDateFormat("EEEE");
		System.out.println(sm.format(d));

		
	}

}
