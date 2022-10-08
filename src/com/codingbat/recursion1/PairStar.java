package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p158175
 */
public class PairStar {
	public static void main(String[] args) {
		PairStar o = new PairStar();
		System.out.println(o.pairStar("hello"));
	}

	public String pairStar(String str) {
		return pairStar(str, "", str.length() - 1);
	}

	private String pairStar(String str, String output, int n) {
		if (n < 0) return "";
		char a = str.charAt(n);
		if (n > 0 && a == str.charAt(n - 1)) return output = pairStar(str, output, n - 1) + "*" + a;
		return output = pairStar(str, output, n - 1) + a;
	}
}
