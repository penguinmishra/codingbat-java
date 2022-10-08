package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p167015
 */
public class Count11 {
	public static void main(String[] args) {
		Count11 o = new Count11();
		System.out.println(o.count11("111"));
	}

	public int count11(String str) {
		return count11(str, str.length() - 1);
	}

	private int count11(String str, int n) {
		if (n < 1) return 0;
		if (str.charAt(n) == '1' && str.charAt(n - 1) == '1') return 1 + count11(str, n - 2);
		else return count11(str, n - 1);
	}
}
