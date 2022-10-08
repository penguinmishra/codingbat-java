package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p108997
 */
public class Array6 {
	public static void main(String[] args) {
		Array6 o = new Array6();
		int[] nums = { 1, 4 };
		System.out.println(o.array6(nums, 0));
	}

	public boolean array6(int[] nums, int index) {
		if (index == nums.length) return false;
		if (nums[index] == 6) return true;
		else return array6(nums, index + 1);
	}

}
