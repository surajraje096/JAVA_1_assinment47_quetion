package Selinium;

public class Q39String {
	public static void main(String[] args) {
		

		String s = "555-666-1234";

		String n[] = s.split("-");
		
		String j = "";
		
		for(int i=0;i<n.length;i++)
		{
			j = j + n[i];
		}
		
		StringBuffer sb = new StringBuffer(j);
		sb.insert(2,'-');
		sb.insert(5,'-');
		sb.insert(9,'-');
		sb.insert(sb.length(),'?');
		String x = sb.toString();
		System.out.println(x);
		
		
		
		
		
	}

}
