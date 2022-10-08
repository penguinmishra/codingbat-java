package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p183649
 */
public class BunnyEars {
	public static void main(String[] args) {
		BunnyEars o = new BunnyEars();
		System.out.println(o.bunnyEars(3));
	}

	public int bunnyEars(int bunnies) {
		int[] mem = new int[bunnies + 1];
		return bunnyEars(bunnies, mem);
	}

	private int bunnyEars(int n, int[] mem) {
		if (n == 0) return 0;
		if (mem[n] != 0) return mem[n];
		return mem[n] = 2 + bunnyEars(n - 1, mem);
	}
}
