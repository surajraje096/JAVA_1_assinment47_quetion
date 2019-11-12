package Selinium;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q19Dateformat {
	public static void main(String[] args) {
		String n = "01/13/2012";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");

		try {
			Date d = sdf.parse(n);
			System.out.println("true");
		} catch (Throwable t) {
			System.out.println("false");
		}
	}

}
