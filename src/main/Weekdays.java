package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {

		List<String> dayNames = new ArrayList<>(7); // Initialize to seven days of a week.
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");

		Scanner obj = new Scanner(System.in);

		String input = obj.next();

		System.out.println(input);
		int number = Integer.parseInt(input);

		String day = "";
		try {
			day = dayNames.get(number);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Index out of bound");
			// e.printStackTrace();
		}
		System.out.println(day);

	}

}
