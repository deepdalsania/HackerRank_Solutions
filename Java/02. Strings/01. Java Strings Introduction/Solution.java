// Problem: https://www.hackerrank.com/challenges/java-strings-introduction
// Difficulty: Easy
// Score: 5


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes" : "No");
		System.out.println(toInitCap(A) + " " + toInitCap(B));
		sc.close();
	}

	public static String toInitCap(String str) {
		return str == null || str.length() == 0 ? "" : str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
