package com.github.rsheremeta;

/*
 * https://leetcode.com/problems/plus-one/
 *
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array
 * contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
  static int[] array1 = {1, 2, 3};
  static int[] array2 = {4, 3, 2, 1};
  static int[] array3 = {0};
  static int[] array4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

  public static void main(String[] args) {
    System.out.println(Arrays.toString(plusOne(array1)));
  }

  public static int[] plusOne(int[] digits) {
    if(digits == null || digits.length == 0){
      return new int[0];
    }

    for(int i = digits.length - 1; i >= 0; i--){
      if(digits[i] < 9){
        digits[i]++;
        return digits;
      }else{
        digits[i] = 0;
      }
    }

    int[] result = new int[digits.length + 1];
    result[0] = 1;

    return result;
  }
}
