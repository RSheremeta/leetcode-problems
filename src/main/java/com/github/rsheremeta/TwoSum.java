package com.github.rsheremeta;

/*
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  static int[] array1 = {2, 7, 11, 15};
  static int target1 = 17;
  static int[] array2 = {3, 2, 3};
  static int target2 = 6;

  public static void main(String[] args) {
    int[] result = twoSum(array2, target2);

    System.out.println(Arrays.toString(result));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] resultsArray = new int[2];
    int index1, index2;

    for (int firstItem = 0; firstItem < nums.length - 1; firstItem++) {
      index1 = nums[firstItem];

      for (int secondItem = firstItem + 1; secondItem < nums.length; secondItem++) {
        index2 = nums[secondItem];

        if (index1+index2==target) {
          resultsArray[0] = firstItem;
          resultsArray[1] = secondItem;
          break;
        }

      }
    }
    return resultsArray;
  }
}
