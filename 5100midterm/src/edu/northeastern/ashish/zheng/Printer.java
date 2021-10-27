package edu.northeastern.ashish.zheng;

//
//class Printer {
//
//    private Printer() {
//    }
//    public static Printer getInstance() {
//    }
//    class Main {
//        public static void main(String[] args) {
//            Printer p1;
//            // refers to the only object of Database
//            p1= Printer.getInstance();
//
//            p1.getConnection();
//        }
//    }
//
//    O/P : Your Printer is working
//
public class Printer {

    private static Printer instance;
    private Printer(){} // No one can create an instance through default constructor

    private static Object obj = new Object();

    public void getConnection(){
        System.out.println("Your Printer is working");
    }
    public static Printer getInstance(){

        if(instance == null){
            synchronized (obj){
                if( instance == null){
                    instance = new Printer();
                }
            }
        }
        return  instance;
    }
    public static void main(String[] args) {
        // write your code here
        Printer p1= Printer.getInstance();
        p1.getConnection();
    }

}







//
//
//    public int lengthOfLongestSubstring(String s) {
//        int[] map = new int[256]; // map from character's ASCII to its last occured index
//
//        int j = 0;
//        int i = 0;
//        int ans = 0;
//        for (i = 0; i < s.length(); i++) {
//            while (j < s.length() && map[s.charAt(j)]==0) {
//                map[s.charAt(j)] = 1;
//                ans = Math.max(ans, j-i + 1);
//                j ++;
//            }
//            map[s.charAt(i)] = 0;
//        }
//
//        return ans;
//    }
//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        // 哈希集合，记录每个字符是否出现过
//        Set<Character> occ = new HashSet<Character>();
//        int n = s.length();
//        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
//        int rk = -1, ans = 0;
//        for (int i = 0; i < n; ++i) {
//            if (i != 0) {
//                // 左指针向右移动一格，移除一个字符
//                occ.remove(s.charAt(i - 1));
//            }
//            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
//                // 不断地移动右指针
//                occ.add(s.charAt(rk + 1));
//                ++rk;
//            }
//            // 第 i 到 rk 个字符是一个极长的无重复字符子串
//            ans = Math.max(ans, rk - i + 1);
//        }
//        return ans;
//    }
//}


