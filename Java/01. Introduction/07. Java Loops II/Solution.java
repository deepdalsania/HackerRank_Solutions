// Problem: https://www.hackerrank.com/challenges/java-loops
// Difficulty: Easy
// Score: 10



import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int total = a;
			for (int j = 0; j < n; j++)
				System.out.print((total += Math.pow(2, j) * b) + " ");
			System.out.println();
		}
		in.close();

	}

}
