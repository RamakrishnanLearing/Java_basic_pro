package java_basics;

import java.util.HashSet;

public class CollectionHashset {
	// not repeated the words
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("Ram");
		list.add("Krishnan");
		list.add("Ravi");
		list.add("Lakshmi");
		list.add("Magha"); // 1st time
		list.add("Lakshmi");
		list.add("Magha"); // 2nd time
		System.out.println(list);
	}
}
