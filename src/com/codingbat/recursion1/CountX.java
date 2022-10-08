package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p170371
 */
public class CountX {
	public static void main(String[] args) {
		CountX o = new CountX();
		System.out.println(o.countX("xhixhix"));
	}

	public int countX(String str) {
		return countX(str, str.length() - 1);
	}

	private int countX(String str, int n) {
		if (n < 0) return 0;
		return (str.charAt(n) == 'x' ? 1 : 0) + countX(str, n - 1);
	}
}
