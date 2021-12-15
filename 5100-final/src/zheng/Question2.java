package zheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question2 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashMap<String, Integer> mp = new HashMap<>();
        int cnt = 0;
        for (String s: strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String tmp = String.valueOf(ch);
            if (!mp.containsKey(tmp)) {
                mp.put(tmp, cnt++);
                ans.add(new ArrayList<String>());
            }
            ans.get(mp.get(tmp)).add(s);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}