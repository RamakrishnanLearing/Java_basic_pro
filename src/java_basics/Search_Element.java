package java_basics;

public class Search_Element {
	public static void main(String[] args) {
		int[] num = { 50, 55, 60, 65, 70 };
		boolean isExist = false;
		int search = 65;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == search) {
				isExist = true;
				search = i;
			}
		}
		if (isExist) {
			System.out.println("Search String :" + search + " found at position :" + search);
		} else {
			System.out.println("Search string not found !!");
		}
	}
}
