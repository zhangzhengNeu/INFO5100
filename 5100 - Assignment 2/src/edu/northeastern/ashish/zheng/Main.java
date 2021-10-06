package edu.northeastern.ashish.zheng;

/* @author ZhengZhang
 *  NUID 001585556
 *  Email: zhang.zheng4@northeastern.edu
 */

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Sum sum = new Sum();
    System.out.println(sum.add(2, 3)); // output : 5
    System.out.println(sum.add(4, 9, 12)); // output : 25
    System.out.println(sum.add(4, 5.0)); // output : 9.0
    System.out.println(sum.add(15.5, 5)); // output : 20.5
    System.out.println(sum.add(1.0, 6.4)); // output : 7.4

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(Arrays.deepToString(leetcode1.transpose(matrix)));

    String[] str = {"practice", "makes", "perfect", "coding", "makes"};
    String word1 = "coding";
    String word2 = "practice";
    System.out.println(leetcode2.shortestDistance(str, word1, word2));

    int[] arr3 = {0, 1, 0, 3, 12};
    leetcode3.moveZeroes(arr3);
    System.out.println(Arrays.toString(arr3));

    int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    leetcode4.rotate(matrix4);
    System.out.println(Arrays.deepToString(matrix4));

    int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<Integer> res5 = leetcode5.spiralOrder(matrix5);
    System.out.println("leetcode5" + res5);

    String s = "egg", t = "add";
    leetcode6.isIsomorphic(s, t);
    System.out.println(leetcode6.isIsomorphic(s, t));

    String num1 = "11", num2 = "123";
    System.out.println(leetcode7.addStrings(num1, num2));

    String ss = "A man, a plan, a canal: Panama";
    System.out.println(leetcode8.isPalindrome(ss));

    String s9 = "the sky is blue";
    System.out.println(leetcode9.reverseWords(s9));

    char[] chars = {'a', 'a', 'b', 'b', 'c'};
    System.out.println(leetcode10.compress(chars));
  }

  /* Q1) Create a Shape class and two sub classes Rectangle and Square
            Shape :
    Fields : name, color, area, perimeter
    Constructors :
    Shape(name, color)
    Shape(name, color, perimeter, area)
    Methods : printShape()
    Rectangle: Inherits Shape
    Fields : width, height
    Constructors:
    Rectangle(side) → If single side is given then set width and height to same value.
            Rectangle(width, height)
    Rectangle(name, color, width, height)
    Square: Inherits Shape
    Fields: side
    Constructors:
    Square(side)
    Square(name, color, side)
  1) Create getter and setter methods for all classes.
            2) Create printShape() method in Shape class that returns desired string output.
            3) Override the getArea() and getPerimeter() getter methods of Shape in Rectangle and
    Square to give desired output.
  4)Use the Shape tester class to test your classes.*/

}
