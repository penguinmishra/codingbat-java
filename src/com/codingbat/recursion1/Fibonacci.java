package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p120015
 */
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci o = new Fibonacci();
		System.out.println(o.fibonacci(10));
	}

	public int fibonacci(int n) {
		int[] mem = new int[n + 1];
		return fibonacci(n, mem);
	}

	private int fibonacci(int n, int[] mem) {
		if (n == 0) return 0;
		if (n < 3) return 1;
		if (mem[n] != 0) return mem[n];
		return fibonacci(n - 1, mem) + fibonacci(n - 2, mem);
	}

}
