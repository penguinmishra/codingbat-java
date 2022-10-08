package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p104029
 */
public class StringClean {
	public static void main(String[] args) {
		StringClean o = new StringClean();
		System.out.println(o.stringClean("zzz"));
	}

	public String stringClean(String str) {
		return stringClean(str, str.length() - 1, '\n');
	}

	private String stringClean(String str, int n, char prev) {
		if (n < 0) return "";
		char a = str.charAt(n);
		if (a == prev) return stringClean(str, n - 1, a);
		else return stringClean(str, n - 1, a) + a;
	}
}
