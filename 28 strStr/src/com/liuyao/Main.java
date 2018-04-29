package com.liuyao;

/**
 *
 实现 strStr() 函数。

 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 示例 1:

 输入: haystack = "hello", needle = "ll"
 输出: 2
 示例 2:

 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 说明:

 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class Main {

    public static void main(String[] args) {
        // write your code hereS
        String string1="mississippi";
        String string2="a";
        System.out.println(Solution.strStr(string1,string2));
    }

    static  class Solution {
        public static int strStr(String haystack, String needle) {
//            if (null == haystack || null == needle) {
//                return 0;
//            }
//            if ("".equals(needle)){
//                return 0;
//            }
//            for (int i = 0; i < haystack.length(); i++) {
//                int begin = i;
//                int start = 0;
//                while (begin<haystack.length() && start<needle.length() && haystack.charAt(begin) == needle.charAt(start)) {
//                    begin++;
//                    start++;
//                }
//                if (start==needle.length()){
//                    return i;
//                }
//            }
//            return -1;

            if(needle==null)
                return 0;
            int place;
            place=haystack.indexOf(needle);
            return place;

        }
    }
}
