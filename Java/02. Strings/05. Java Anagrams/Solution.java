// Problem: https://www.hackerrank.com/challenges/java-anagrams
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {

		int[] chars = new int[26];
		if (a.length() != b.length()) {
			return false;
		}
		// we can use this combine loop but when someone enter CAT and act both string
		// in different case at that time this dosen't work
		/*
		 * for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) { int i1 =
		 * (int) a.charAt(i); int i2 = (int) b.charAt(i); if (65 <= i1 && i1 <= 90 && 65
		 * <= i2 && 65 <= i2) { i1 += 32; i2 += 32; } i1 -= 97; chars[i1]++; i2 -= 97;
		 * chars[i2]--; }
		 */

		// In this you can pass any type of case like cAt and aCT anything
		for (int i = 0; i < a.length(); i++) {
			int i1 = (int) a.charAt(i);
			// convert from upper to lowers
			if (65 <= i1 && 90 >= i1) {
				i1 += 32;
			}
			i1 -= 97;
			chars[i1]++;
		}

		for (int i = 0; i < b.length(); i++) {
			int i2 = (int) b.charAt(i);
			// convert from upper to lowers
			if (65 <= i2 && 90 >= i2) {
				i2 += 32;
			}
			i2 -= 97;
			chars[i2]--;
		}

		for (int i = 0; i < 26; i++) {
			if (chars[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Solution" : "Not Solution");
	}
}
