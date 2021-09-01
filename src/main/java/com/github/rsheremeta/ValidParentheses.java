package com.github.rsheremeta;

/*
* https://leetcode.com/problems/valid-parentheses/
*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*
An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
*/

import java.util.Arrays;
import java.util.HashMap;

public class ValidParentheses {
  static String val1 = "()";
  static String val2 = "()[]{}";
  static String val3 = "(]";

  public static void main(String[] args) {
    System.out.println(isValid(val2));
  }

  // TODO - fix ArrayIndexOutOfBoundsException and implement solution
  public static boolean isValid(String s) {
    boolean isValid = false;
    HashMap<String, String> map = getParentheses();
    String[] array = s.split("");

    for (int i = 0; i < array.length; i++) {
      String currentItem = map.get(array[i]);
      String nextItem = map.get(array[i+1]);
      String endingItem = map.get(array[ array.length - (i+1) ]);

      System.out.println("currentItem: " + currentItem);
      System.out.println("nextItem: " + nextItem);
      System.out.println("endingItem: " + endingItem);
    }


    return isValid;
  }

  public static HashMap<String, String> getParentheses() {
    HashMap<String, String> map = new HashMap<>();
    map.put("(", ")");
    map.put(")", "(");
    map.put("{", "}");
    map.put("}", "{");
    map.put("[", "]");
    map.put("]", "[");
    return map;
  }



}
