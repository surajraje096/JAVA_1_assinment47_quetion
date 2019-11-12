package Selinium;

public class Q40Stringreverse {
	public static void main(String[] args) {
		
		String s = "Rajasthan";
				StringBuffer sb = new StringBuffer(s);
				sb.reverse();
				String n = sb.toString();
				System.out.println(n.substring(2,5));
	}

}
