package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p170924
 */
public class ChangePi {
	public static void main(String[] args) {
		ChangePi o = new ChangePi();
		System.out.println(o.changePi("pipi"));
	}

	public String changePi(String str) {
		return changePi(str, "", str.length() - 1);
	}

	private String changePi(String str, String output, int n) {
		if (n < 0) return "";
		if (n - 1 >= 0 && str.charAt(n - 1) == 'p' && str.charAt(n) == 'i') output = changePi(str, output, n - 2) + "3.14";
		else output = changePi(str, output, n - 1) + str.charAt(n);
		return output;
	}

}
