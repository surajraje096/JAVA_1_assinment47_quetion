package Selinium;

public class Q46inputAndsum {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int no =1,
		ans = 0;
				for(int i=0;i<a.length;i++)
				{
					int x = a[i];
					if(x>no)
					{
						ans = ans + x;
					}
					
				}
				
				String n = String.valueOf(ans);
				
				StringBuffer sb = new StringBuffer(n);
				
				sb.reverse();
				String nj =  sb.toString();
				int k = Integer.parseInt(nj);
				
				System.out.println(k);

	}

}
