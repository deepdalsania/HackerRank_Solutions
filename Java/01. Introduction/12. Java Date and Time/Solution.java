// Problem: https://www.hackerrank.com/challenges/java-date-and-time
// Difficulty: Easy
// Score: 15


import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
		// return LocalDate.of(year, month, day).getDayOfWeek().toString();
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();// Integer.parseInt();

		int day = s.nextInt();// Integer.parseInt(firstMultipleInput[1]);

		int year = s.nextInt();// Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);
		System.out.println("result : " + res);
		s.close();
	}
}