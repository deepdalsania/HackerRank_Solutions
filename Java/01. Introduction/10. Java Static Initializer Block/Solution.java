// Problem: https://www.hackerrank.com/challenges/java-static-initializer-block
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {

	static Scanner scanner = new Scanner(System.in);
	static int B = scanner.nextInt();
	static int H = scanner.nextInt();
	static boolean flag = B > 0 && H > 0;
	static {
		if (!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}