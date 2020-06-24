// Problem: https://www.hackerrank.com/challenges/java-stdin-stdout
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();
		System.out.println("String: " + s + "\nDouble: " + d + "\nInt: " + i);
	}
}
