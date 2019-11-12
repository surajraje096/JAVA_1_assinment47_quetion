package Selinium;

public class Q18ConcatString {
public static void main(String[] args) {
		

		String n = "hi";
		String j = "hello";
		String ans = "";
		
		if(n.length()==j.length())
		{
			ans = n.concat(j);
		}
		else if(n.length()>j.length())
		{
			String f = n.substring(j.length()+1,n.length());
			ans = f.concat(j);
		}
		else
		{
			String d = j.substring(n.length()+1,j.length());
			ans = d.concat(n);
		}
		System.out.println(ans);
		
		
		

}
}