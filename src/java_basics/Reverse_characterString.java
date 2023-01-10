package java_basics;

public class Reverse_characterString {
	public static void main(String[] args) {
		String word = "ramakrishnan";
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
