package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p137918
 */
public class ParenBit {
	public static void main(String[] args) {
		ParenBit o = new ParenBit();
		System.out.println(o.parenBit("(xy)1"));
	}

	public String parenBit(String str) {
		return parenBit(str, 0, str.length() - 1);
	}

	private String parenBit(String str, int i, int n) {
		if (str.charAt(i) != '(') return parenBit(str, i + 1, n);
		if (str.charAt(n) != ')') return parenBit(str, i, n - 1);
		return str.substring(i, n + 1);
	}
}
