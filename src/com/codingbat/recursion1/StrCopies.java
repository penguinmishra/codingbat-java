package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p118182
 */
public class StrCopies {
	public static void main(String[] args) {
		StrCopies o = new StrCopies();
		System.out.println(o.strCopies("catcowcat", "cat", 2));
	}

	public boolean strCopies(String str, String sub, int n) {
		return strCount(str, sub) == n;
	}
	
	public int strCount(String str, String sub) {
		if (str.length() < sub.length()) return 0;
		if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(1), sub);
		else return strCount(str.substring(1), sub);
	}
}
