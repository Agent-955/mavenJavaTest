package com.czfan;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n);
        return s2+s1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = solution.reverseLeftWords("阿拉伯半岛",3);
        System.out.println(str);
    }
}
