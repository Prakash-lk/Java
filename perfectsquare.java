# Java
For Practice

/*Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in.new Scanner(System.in);
		int num=in.nextInt();
		boolean flg=false;
        if(num==1)
        {
            return true;
        }
        else
        {
            for(int i=1;i<num;i++){
                if(i*i==num){
                    flg=true;
                    break;
                }
            }
        }
        System.out.println(flg);
	}
}
