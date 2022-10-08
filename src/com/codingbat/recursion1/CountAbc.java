package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p161124
 */
public class CountAbc {
	public static void main(String[] args) {
		CountAbc o = new CountAbc();
		System.out.println(o.countAbc("ababc"));
	}

	public int countAbc(String str) {
		return countAbc(str, 0);
	}

	private int countAbc(String str, int i) {
		if (i > str.length() - 3) return 0;
		String s = str.charAt(i) + "" + str.charAt(i + 1) + "" + str.charAt(i + 2);
		if (s.equals("abc") || s.equals("aba")) return 1 + countAbc(str, i + 2);
		return countAbc(str, i + 1);
	}
}
