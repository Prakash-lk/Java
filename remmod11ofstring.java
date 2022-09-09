# Java
For Practice

/*Given a number n, the task is to find the remainder when n is divided by 11. The input number may be very large.

Since the given number can be very large, you can not use n % 11.

Input Specification:
inputs a large number in the form of a string

Output Specification:
Return the remainder modulo 11 of input1

Example1:
Input: str = 13589234356546756
Output: 6

Example2:
Input: str = 3435346456547566345436457867978
Output: 4

Example3:
input: str = 121
Output: 0
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String str=in.next();
	    int rem=0,num;
		for(int i=0;i<str.length();i++){
		    num=rem*10+(str.charAt(i)-'0');
		    rem=num%11;
		}
		System.out.println(rem);
	}
}
