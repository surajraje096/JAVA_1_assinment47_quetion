package Selinium;

public class Q10Marks {
	public static void main(String[] args) {//Tokenizer
		
		String n[]={"arun#10#12#12","deepak#13#12#12"};
		
		String ans = "";		int ans1 = 0,add=0;
		for(int i=0;i<n.length;i++)
		{
			String x = n[i];
			String a[] = x.split("#");
			
			for(int j=1;j<a.length;j++)
			{
				String n1 = a[j];
				int no = Integer.parseInt(n1);
				add = add + no;
				
			}
			
			if(ans1<add)
			{
				ans1 = add;
				ans = a[0];
			}
			add=0;
		}System.out.println(ans);

	
	
	}
}
