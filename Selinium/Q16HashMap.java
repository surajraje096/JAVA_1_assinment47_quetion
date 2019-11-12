package Selinium;

import java.util.HashMap;
import java.util.Map;

public class Q16HashMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(12, 90);
		hm.put(35, 30);
		hm.put(33, 30);
		hm.put(56, 30);

		int sum = 0;
		int cont = 0;
		for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
			int value = me.getValue();
			int key = me.getKey();
			if (key % 2 != 0) {
				sum = sum + value;
				cont++;
			}
			
		}
		int average = sum / cont;
		System.out.println(average);

	}

}
