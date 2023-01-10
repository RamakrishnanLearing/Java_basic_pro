package java_basics;

import java.util.Scanner;

public class String_count {
	public static void main(String[] args) {
		String str = " ";
		System.out.println(str);
		// str=str.toLowerCase();
		Scanner strScanner = new Scanner(System.in);
		System.out.println(strScanner);
		{
			String str1 = strScanner.nextLine();
			char temp = '0';
			int count = 0;
			for (int i = 0; i < str1.length(); i++) {
				temp = str1.charAt(i);
				if (temp == 'a' || temp == 'A' || temp == 'i' || temp == 'I' || temp == 'e' || temp == 'E'
						|| temp == 'o' || temp == 'O' || temp == 'u' || temp == 'U') {
					++count;
				}
			}
			System.out.println("Vowlel character count :" + count);
		}
	}
}
