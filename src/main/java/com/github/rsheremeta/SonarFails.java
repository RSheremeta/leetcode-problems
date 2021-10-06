package com.github.rsheremeta;

import java.util.Locale;

/*
* This class is created for catching code_smells/failures/bugs/etc by SonarCloud on CI
* All class contents are intentional
* author @RSheremeta
* */
public class SonarFails {
  public static String anullstr = null;


  public static void main(String[] args) {
    getStr("aaaaa");
    int aaaa = getInt();
    System.out.println(obj().equals(anullstr)); // NPE
  }

  public static int tryMethod() {
    int a = 0;
    try {
      a = 10;
    }
    catch (Exception e) {
      a = -10;
      e.printStackTrace();
    }
    finally {
      return a;
    }
  }

  public static String getStr(String a) {
    String b = a + "-b";
    return a;
  }

  public static int getInt() {
    return 1;
  }

  public static Object obj() {
    return new Object();
  }

}
