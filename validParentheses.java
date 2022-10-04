# Java
For Practice

/*
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

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
		  int cnt=0,cnt1=0,cn=0,cn1=0,cont=0,cont1=0;
        boolean flg=true;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               cnt++;
           }
           if(s.charAt(i)==')'){
               cnt1++;
           }
           if(s.charAt(i)=='['){
               cn++;
           }
           if(s.charAt(i)==']'){
               cn1++;
           }
           if(s.charAt(i)=='{'){
               cont++;
           }
           if(s.charAt(i)=='}'){
               cont1++;
           }
        }
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}'){
            flg=false;
        }
        if(cnt==cnt1 && cn==cn1 && cont==cont1){
            flg=true;
        }
        else{
            flg=false;
        }
        System.out.println(flg);
	}
}
