package hackerankjavabasic;

import java.util.Scanner;

class Parser {
	boolean isBalanced(String s) {
		while (s.length() != (s = s.replaceAll("\\(\\)|\\{\\}", "")).length())
			;

		return s.isEmpty();

	}
}

class Solution {

	public static void main(String[] args) {
		Parser parser = new Parser();

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}

		in.close();
	}
}