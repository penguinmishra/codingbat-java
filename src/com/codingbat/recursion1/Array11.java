package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p135988
 */
public class Array11 {
	public static void main(String[] args) {
		Array11 o = new Array11();
		int[] nums = { 11, 11 };
		System.out.println(o.array11(nums, 0));
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length) return 0;
		if (nums[index] == 11) return 1 + array11(nums, index + 1);
		else return array11(nums, index + 1);
	}

}
