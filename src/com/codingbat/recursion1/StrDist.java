package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p195413
 */
public class StrDist {
	public static void main(String[] args) {
		StrDist o = new StrDist();
		System.out.println(o.strDist("catcowcat", "cat"));
	}

	public int strDist(String str, String sub) {
		if (str.length() < sub.length())
			return 0;
		if (str.startsWith(sub)) { // if str starts with sub, we need to find out the last occurance of sub
			if (str.substring(str.length() - sub.length()).equals(sub)) // if sub is at last, return entire str length
				return str.length();
			else // str doesn't end with sub. check in sub string of 0->end index - 1
				return strDist(str.substring(0, str.length() - 1), sub);
		} else
			return strDist(str.substring(1), sub);
	}
}
