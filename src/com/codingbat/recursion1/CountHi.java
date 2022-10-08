package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p184029
 */
public class CountHi {
	public static void main(String[] args) {
		CountHi o = new CountHi();
		System.out.println(o.countHi("ihihihihih"));
	}

	public int countHi(String str) {
		return countHi(str, str.length() - 1);
	}

	private int countHi(String str, int n) {
		if (n < 0) return 0;
		if (n - 1 >= 0 && str.charAt(n) == 'i' && str.charAt(n - 1) == 'h') return 1 + countHi(str, n - 2);
		return countHi(str, n - 1);
	}
}
