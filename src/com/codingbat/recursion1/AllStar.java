package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p183394
 */
public class AllStar {
	public static void main(String[] args) {
		AllStar o = new AllStar();
		System.out.println(o.allStar("hello"));
	}

	public String allStar(String str) {
		return allStar(str, "", str.length() - 1);
	}

	private String allStar(String str, String output, int n) {
		if (n < 0) return "";
		char a = str.charAt(n);
		return output = allStar(str, output, n - 1) + (n == 0 ? a : "*" + a);
	}
}
