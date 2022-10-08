package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p105722
 */
public class EndX {
	public static void main(String[] args) {
		EndX o = new EndX();
		System.out.println(o.endX("xhixhix"));
	}

	public String endX(String str) {
		return endX(str, "", 0);
	}

	private String endX(String str, String output, int i) {
		if (i > str.length() - 1) return "";
		char a = str.charAt(i);
		return output += a == 'x' ? endX(str, output, i + 1) + a : a + endX(str, output, i + 1);
	}
}
