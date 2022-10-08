package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p101409
 */
public class Count7 {
	public static void main(String[] args) {
		Count7 o = new Count7();
		System.out.println(o.count7(70701277));
	}

	public int count7(int n) {
		if (n == 0) return 0;
		return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
	}
}
