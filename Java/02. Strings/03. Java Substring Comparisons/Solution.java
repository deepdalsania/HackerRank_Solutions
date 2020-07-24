// Problem: https://www.hackerrank.com/challenges/java-string-compare
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		for (int i = 0; i <= s.length() - k; i++) {
			String subStr = s.substring(i, k + i);
			if (smallest.compareTo(subStr) > 0) {
				smallest = subStr;
			} else if (largest.compareTo(subStr) < 0) {
				largest = subStr;
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
