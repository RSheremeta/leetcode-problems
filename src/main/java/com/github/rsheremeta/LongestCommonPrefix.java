package com.github.rsheremeta;
/*
* https://leetcode.com/problems/longest-common-prefix/
*
* Write a function to find the longest common prefix string amongst an array of strings.
* If there is no common prefix, return an empty string "".
*
* Example:
*
* Input: strs = ["flower","flow","flight"]
* Output: "fl"
*/

// TODO - get back and solve this

public class LongestCommonPrefix {
  static String[] strs1 = {"flower","flow","flight"};
  static String[] strs2 = {"dog","racecar","car"};

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(strs1));
  }

  public static String longestCommonPrefix(String[] strs) {
    String prefix = "";
    String wordChar = "";

    for (int words = 0; words < strs.length-1; words++) {
      wordChar = strs[words].charAt(words) + "";

//      for (int next = words+1; next < strs.length-1; next++) {
        String nextWordChar = strs[words+1].charAt(words+1) + "";
        if (nextWordChar.equals(wordChar))
          prefix += nextWordChar;
//      }

//      for (int chars = 0; chars <= words; chars++) {
//        char targetChar = strs[words].charAt(chars);
//      }
    }

    return prefix;
  }
}
