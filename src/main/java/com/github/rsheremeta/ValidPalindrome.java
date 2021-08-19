package com.github.rsheremeta;

/*
* https://leetcode.com/problems/valid-palindrome/
*
* Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
* Example:
*
* Input: s = "A man, a plan, a canal: Panama"
* Output: true
* Explanation: "amanaplanacanalpanama" is a palindrome.
*/

import java.util.*;
import java.util.stream.Collectors;

public class ValidPalindrome {
  static String str1 = "A man, a plan, a canal: Panama";
  static String str2 = "race a car";

  public static void main(String[] args) {
    System.out.println(isPalindrome(str2));
  }

  // TODO - fix with str2
  public static boolean isPalindrome(String s) {
    boolean verify = true;
    List<Character> alphabetChars = new ArrayList<>();
    List<Character> reversedAlphaChars = new ArrayList<>();
    char[] allChars = s.toLowerCase(Locale.ROOT).toCharArray();

    for (int i = 0; i < allChars.length-1; i++) {
      char c = allChars[i];
      if ((c >= 'a' && c <= 'z'))
        alphabetChars.add(c);
    }

    for (int i = alphabetChars.size()-1; i >= 0; i--)
      reversedAlphaChars.add(alphabetChars.get(i));

    for (int i = 0; i < reversedAlphaChars.size()-1; i++) {
      char reversedItem = reversedAlphaChars.get(i);
      char plainItem = alphabetChars.get(alphabetChars.size()-1-i);
      if (reversedItem != plainItem) {
        verify = false;
        break;
      }
    }

    return verify;
  }

}
