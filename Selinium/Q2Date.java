package Selinium;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2Date {
	public static void main(String[] args) throws ParseException{
		String n = "12/27/2012";
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Date dt1 = sdf.parse(n);

		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dt1));
	}

}
