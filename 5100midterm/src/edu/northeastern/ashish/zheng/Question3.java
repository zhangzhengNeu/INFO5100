package edu.northeastern.ashish.zheng;

//Question 3) For the given array, return the sum of all the numbers which are repeated.
//
//        Ex: Input : array = {1,3,-1,3,4,-1}
//
//        Output : 3 + (-1) = 2

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static int sumOfRepeated(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() > 1){
                res+=e.getKey();
            }
        }
        return res;
    }
}
