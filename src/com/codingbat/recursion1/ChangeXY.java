package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p101372
 */
public class ChangeXY {
	public static void main(String[] args) {
		ChangeXY o = new ChangeXY();
		String s = "xhixhix";
		System.out.println(o.changeXY(s));
	}

	public String changeXY(String str) {
		return changeXY(str, "", str.length() - 1);
	}

	private String changeXY(String str, String output, int n) {
		if (n < 0) return "";
		char a = str.charAt(n);
		return changeXY(str, output, n - 1) + (a == 'x' ? 'y' : a);
	}
}
