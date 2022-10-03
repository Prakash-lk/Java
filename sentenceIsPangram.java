# Java
For Practice

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/

#java

class Solution {
    public boolean checkIfPangram(String sentence) {
        int len=sentence.length();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<len;i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        else{
            return false;
        }
    }
}
