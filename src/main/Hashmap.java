package main;

import java.util.HashMap;

// Main class
public class Hashmap {

	// Main driver method
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		addName(map, "vishal", 30);
		addName(map, "sachin", 30);
		addName(map, "vaibhav", 20);

		displayValue(map, "sachin");
		removename(map, "vishal");

	}

	private static void removename(HashMap<String, Integer> map, String name) {
		map.remove("name");
	}

	private static void addName(HashMap<String, Integer> map, String name, int grade) {
		map.put(name, grade);
	}

	private static void displayValue(HashMap<String, Integer> map, String name) {
		System.out.println(name + "'s grade is " + map.get(name));
	}
}
