// Problem: https://www.hackerrank.com/challenges/java-string-reverse
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(str.equalsIgnoreCase(rev) ? "Yes" : "No");

		// This is another way to find palindrome string
		/*
		 * String palindrome = "Yes"; for (int i = 0; i <= str.length() / 2; i++) { if
		 * (!str.substring(i, i + 1).equalsIgnoreCase(str.substring(str.length() - i -
		 * 1, str.length() - i))) { palindrome = "No"; } }
		 * System.out.println(palindrome);
		 */
		s.close();
	}
}
