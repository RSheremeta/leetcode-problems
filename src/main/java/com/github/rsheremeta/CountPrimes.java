package com.github.rsheremeta;

/*
* https://leetcode.com/problems/count-primes/
*
* Count the number of prime numbers less than a non-negative number, n.
*
* Example 1:
*
* Input: n = 10
* Output: 4
* Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*
*
*/

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
  static int a = 10;
  static int b = 0;
  static int c = 1;

  public static void main(String[] args) {
    System.out.println(countPrimes(a));
  }

  // TODO - fix that
  public static int countPrimes(int number) {
    List<Integer> numList = new ArrayList<>();

    for (int i = 1; i < number; i++) {
      int counter = 0;
      for(int num = i; num >= 1; num--) {
        if(i % num == 0) {
          counter = counter + 1;
        }
      }
      if (counter ==2) {
        numList.add(i);
      }
    }

    System.out.println(numList);

    return numList.size();
  }

}
