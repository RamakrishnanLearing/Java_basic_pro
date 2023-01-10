package java_basics;

public class Reapeated_WordinString {
	public static void main(String[] args) {
		String s1 = "Welcome world";
		int l = s1.length(); // count the string full length
		System.out.println(s1.length());
		char[] ch = s1.toCharArray(); // character = string to character Array
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("repeated char's are : " + ch[j]);
					break;
				}
			}
		}
	}
}
