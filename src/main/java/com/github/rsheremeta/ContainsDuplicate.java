package com.github.rsheremeta;

/*
* https://leetcode.com/problems/contains-duplicate/
*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*
* Example 1:
* Input: nums = [1,2,3,1]
* Output: true
*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  static int[] arr1 = {1, 2, 3, 1};
  static int[] arr2 = {1, 2, 3, 4, 4};
  static int[] arr3 = {1, 2, 3};

  public static void main(String[] args) {
    System.out.println(containsDuplicate(arr3));
  }

  public static boolean containsDuplicate(int[] nums) {
    boolean isDuplicate = false;
    Set<Integer> numSet = new HashSet<>();

    for (int i = 1; i < nums.length; i++) {
      int previous = nums[i-1];
      int current = nums[i];
      numSet.add(previous);
      if (numSet.contains(current)) {
        isDuplicate = true;
        break;
      }
    }

    return isDuplicate;
  }
}
