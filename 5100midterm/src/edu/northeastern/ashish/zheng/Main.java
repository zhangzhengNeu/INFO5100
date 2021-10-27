package edu.northeastern.ashish.zheng;

import com.sun.source.tree.Tree;

import static edu.northeastern.ashish.zheng.Question3.sumOfRepeated;
import static edu.northeastern.ashish.zheng.Question4.lengthOfLongestSubstring;

public class Main {

    public static void main(String[] args) {
        // write your code here
          Fiction f = new Fiction("ss",3.2,"1997");
          f.setBorrowDate(2);
          f.setReturnDate(8);
          System.out.println(f.isAvailable(9));
          System.out.println(f.description());

        Printer p1= Printer.getInstance();
        p1.getConnection();

        int[] array = {1,3,-1,3,4,-1};
        System.out.println(sumOfRepeated(array));

        String s1 = "aabdcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));


    }
}