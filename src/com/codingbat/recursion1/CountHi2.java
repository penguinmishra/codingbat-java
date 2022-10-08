package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p143900
 */
public class CountHi2 {
	public static void main(String[] args) {
		CountHi2 o = new CountHi2();
		System.out.println(o.countHi2("xhixhi"));
	}

	public int countHi2(String str) {
		return countHi2(str, str.length());
	}

	private int countHi2(String str, int n) {
		if (n < 2) return 0;
		if (str.charAt(n - 2) == 'h' && str.charAt(n - 1) == 'i' && (n - 3 < 0 || str.charAt(n - 3) != 'x')) return 1 + countHi2(str, n - 2);
		else return countHi2(str, n - 1);
	}
}
