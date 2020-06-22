// Problem: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
// Difficulty: Easy
// Score: 5


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		System.out.println(a + "\n" + b + "\n" + c);
	}
}
