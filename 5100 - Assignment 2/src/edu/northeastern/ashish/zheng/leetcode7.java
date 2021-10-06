package edu.northeastern.ashish.zheng;

public class leetcode7 {
  public static String addStrings(String num1, String num2) {
    int p1 = num1.length() - 1, p2 = num2.length() - 1, add = 0;
    StringBuilder ss = new StringBuilder();
    while (p1 >= 0 || p2 >= 0 || add > 0) {
      int c1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
      int c2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
      int sum = c1 + c2 + add;
      add = sum / 10;
      int val = sum % 10;
      ss.append(val);
      p1--;
      p2--;
    }

    return ss.reverse().toString();
  }
}
