# Java
For Practice

?*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/

#java

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch =='['){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '('){
                    return false;
                }else{
                    st.pop();
                }
            }
            else if(ch == '}'){
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '{'){
                    return false;
                }else{
                    st.pop();
                }
            }
            else if(ch == ']'){
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '['){
                    return false;
                }else{
                    st.pop();
                }
            }    
        }    
        if(st.size() == 0){
            return true; 
        }else{
            return false;
        }
    }
}
