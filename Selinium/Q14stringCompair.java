package Selinium;

public class Q14stringCompair {

	public static void main(String[] args) {

		int match = 0;
		String word = "";
		String str = ("hello how are you kkaaaaa");
		String split[] = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			String temp = split[i];
			if (match < temp.length()) {

				//match = temp.length();
				word=temp;
			}

		}
		System.out.println(word);

	}

}
