package com.github.rsheremeta;

/*
 * https://leetcode.com/problems/length-of-last-word/
 *
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.
 *
 * Example:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The words are "Hello" and "World", both of length 5.
 */

public class LengthOfLastWord {
  static String word1 = "Hello World";
  static String word2 = "   fly me   to   the moon  ";

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord(word1));
    System.out.println(lengthOfLastWord(word2));
  }

  public static int lengthOfLastWord(String s) {
    int wordSize = 0;
    String[] wordsArray = s.split(" ");
    String lastWord = wordsArray[wordsArray.length - 1];
    if (wordsArray.length != 0) {
      if (!lastWord.isEmpty())
        wordSize = lastWord.length();
    }
    return wordSize;
  }
}
