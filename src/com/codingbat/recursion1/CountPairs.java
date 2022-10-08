package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p154048
 */
public class CountPairs {
	public static void main(String[] args) {
		CountPairs o = new CountPairs();
		System.out.println(o.countPairs("axay"));
	}

	public int countPairs(String str) {
		return countPairs(str, str.length() - 1);

	}

	private int countPairs(String str, int n) {
		if (n < 0 || n < 2) return 0;
		if (str.charAt(n) == str.charAt(n - 2)) return 1 + countPairs(str, n - 1);
		return countPairs(str, n - 1);
	}
}
