package java_basics;

public class Reverse_Wordstring {
	public static void main(String[] args) {
		String name = "Ramakrishnan Jawahar";
		String[] str = name.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}
}
