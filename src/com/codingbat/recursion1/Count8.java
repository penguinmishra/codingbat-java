package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p192383
 */
public class Count8 {
	public static void main(String[] args) {
		Count8 o = new Count8();
		System.out.println(o.count8(8088));
	}

	public int count8(int n) {
		if (n == 0) return 0;
		return (n % 10 == 8 ? ((n / 10) % 10 == 8 ? 2 : 1) : 0) + count8(n / 10);
	}
}
