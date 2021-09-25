package edu.northeastern.ashish.zheng;
/* @author ZhengZhang
 *  NUID 001585556
 *  Email: zhang.zheng4@northeastern.edu
 */

import java.util.*;

public class Main<elements> {

    public static void main(String[] args) {
	// write your code here

        //q1
        int[] nums1 = {1,2,3,2};
        System.out.println("Question 1" + ":" + sumOfUnique(nums1));
        //q2
        int[] nums2 = {-4,-1,0,3,10};
        System.out.println("Question 2" + ":" + Arrays.toString(sortedSquares(nums2)));

        //q3
        int[] nums3 = {2,3,4,2,2,3,5,7};
        System.out.println("Question 3" + ":" + nonRepeated(nums3));

        //q4
        String ransomNote = "a", magazine = "ab";
        System.out.println("Question 4" + ":" + canConstruct(ransomNote,magazine));

        //q5
        String str = "1A35d4s5t";
        System.out.println("Question 5" + ":" + checkString(str));



    }

    /*Question 1:
    You are given an integer array nums. The unique elements of an array are the elements that
    appear exactly once in the array.
    Return the sum of all the unique elements of nums.
    Example 1:
    Input: nums = [1,2,3,2]
    Output: 4
    Explanation: The unique elements are [1,3], and the sum is 4.*/

    public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                res+=e.getKey();
            }
        }
        return res;
    }

    /*
    Question 2:
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
    number sorted in non-decreasing order.
    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    */

    public static int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }

   /* Question 3:
    Find first non repeated integer in an array.
    Example: int[] arr = {2,3,4,2,2,3,5,7}

    Output : 4*/
   public static int nonRepeated(int[] A) {
       int[] elements = { 1, 1, 2, 3, 3, 4 };
       Set<Integer> singleSet = new HashSet<>();
       Set<Integer> repeatedSet = new HashSet<>();

       for (int e : elements) {
           if (repeatedSet.contains(e)) {
               continue;
           }
           if (singleSet.contains(e)) {
               singleSet.remove(e);
               repeatedSet.add(e);
           } else {
               singleSet.add(e);
           }
       }

       for (int e : elements) {
           if (singleSet.contains(e)) {
               return e;
           }
       }
       return -1;
   }

    /*Question 4:
    Given two stings ransomNote and magazine, return true if ransomNote can be constructed
    from magazine and false otherwise.
    Example 1:
    Input: ransomNote = "a", magazine = "ab"
    Output: false
    Each letter in magazine can only be used once in ransomNote.*/


        public static boolean canConstruct(String ransomNote, String magazine) {

            char[] count = new char[26];

            for (int i = 0; i < magazine.length(); i++) {
                count[magazine.charAt(i) - 'a']++;
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                if (count[ransomNote.charAt(i) - 'a'] == 0) {
                    return false;
                }

                count[ransomNote.charAt(i)- 'a']--;
            }

            return true;
        }

    /*Question 5:
    Letter followed by Digit: Given a string str write a function which will check if the string no
    letter followed by another letter, and no digit followed by another digit.
    For example: 1A3d4s5t
    Result : True
    Input: A2bb2d4
    Result : False*/

    public static boolean isDigit(char ch){
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }
    public static boolean isLetter(char ch){
        if (ch >= 'A' && ch <= 'z')
            return true;
        return false;
    }
    public static boolean checkString(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(isDigit(s.charAt(i)) && isDigit(s.charAt(i + 1))){
                return false;
            }
            if(isLetter(s.charAt(i)) && isLetter(s.charAt(i + 1))){
                return false;
            }
        }
        return true;
    }

}








