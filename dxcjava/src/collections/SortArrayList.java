package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("abcd");
		fruits.add("bcda");
		fruits.add("cdab");
		fruits.add("dabc");
		fruits.add("abcde");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);

	}

}