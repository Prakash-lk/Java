# Java
For Practice

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="anagram";
	    String t="nagaram";
		char res[]=s.toCharArray();
        char res1[]=t.toCharArray();
        Arrays.sort(res);
        Arrays.sort(res1);
        String str1=String.valueOf(res);
        String str2=String.valueOf(res1);
        if(str1.equals(str2))   System.out.println(true);
        else    System.out.println(false);
	}
}
