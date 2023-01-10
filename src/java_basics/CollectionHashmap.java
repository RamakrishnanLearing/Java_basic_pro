package java_basics;

import java.util.HashMap;

public class CollectionHashmap {
	public static void main(String[] args) {
		String letter = "Hi Guvi Thanaks for giving this java Automation learing";
		String[] word = letter.split(" ");
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		for (String i : word) {
			if (words.containsKey(i)) {
				words.put(i, words.get(i) + 1);
			} else {
				words.put(i, 1);
			}
		}
		System.out.println(words);
	}
}
