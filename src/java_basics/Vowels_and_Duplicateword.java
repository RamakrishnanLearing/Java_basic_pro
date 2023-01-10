package java_basics;

import java.util.HashMap;
import java.util.Scanner;

public class Vowels_and_Duplicateword {
	public static void main(String[] args) {
		String words = " ";
		System.out.println("Enter The Words : ");
		System.out.println(words);
		Scanner en = new Scanner(System.in);
		System.out.println(en);
		String en1 = en.nextLine();
		en1 = en1.toLowerCase(); // ALL the laters are lowercase
		HashMap<Character, Integer> vowels = new HashMap<Character, Integer>();
		vowels.put('a', 0);
		// vowels.put('A',0);
		vowels.put('e', 0);
		// vowels.put('E',0);
		vowels.put('i', 0);
		// vowels.put('I',0);
		vowels.put('o', 0);
		// vowels.put('O',0);
		vowels.put('u', 0);
		// vowels.put('U',0);
		int l = en1.length();
		System.out.println(l);
		for (int i = 0; i <= en1.length() - 1; i++) {
			if (vowels.containsKey(en1.charAt(i))) {
				int count = vowels.get(en1.charAt(i));
				vowels.put(en1.charAt(i), ++count);
			}
		}
		// System.out.println(vowels);
		System.out.println(vowels.entrySet());
		int count;
		// Converts given string into character array
		char string[] = en1.toCharArray();
		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					++count;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}
}
