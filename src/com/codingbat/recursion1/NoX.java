package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p118230
 */
public class NoX {
	public static void main(String[] args) {
		NoX o = new NoX();
		System.out.println(o.noX("abc"));
	}

	public String noX(String str) {
		return noX(str, "", str.length() - 1);
	}

	private String noX(String str, String output, int n) {
		if (n < 0) return "";
		if (str.charAt(n) == 'x') output += noX(str, output, n - 1);
		else output = noX(str, output, n - 1) + str.charAt(n);
		return output;
	}
}
