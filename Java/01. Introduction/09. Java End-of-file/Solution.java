// Problem: https://www.hackerrank.com/challenges/java-end-of-file
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ctr = 1;
		while (s.hasNext()) {
			System.out.println(ctr + " " + s.nextLine());
			ctr++;
		}
		s.close();
	}
}
