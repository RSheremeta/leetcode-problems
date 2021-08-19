package com.github.rsheremeta;

/*
 * https://leetcode.com/problems/single-number/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {
  static int[] arr1 = {2, 2, 1};
  static int[] arr2 = {4, 1, 2, 1, 2};
  static int[] arr3 = {2};

  public static void main(String[] args) {
    System.out.println(singleNumber(arr2));
  }

  public static int singleNumber(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      res = res^nums[i];
    }
    return res;
  }

}
