# Java
For Practice

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

#java

class Solution {
    public int strStr(String haystack, String needle) {
        int n = 0;
        if(!haystack.contains(needle))
            return -1;
        else{
            for(int i =0;i<=haystack.length();i++){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    n=i;
                    break;
                }
            }
            return n;
        }
    }
}
