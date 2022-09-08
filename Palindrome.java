# Java
For Practice

/*Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int x=in.nextInt();
		int ox=x;
        int rem,rx=0;
        if(x<0){
            System.out.println("false");
        }else{
            while(x!=0){
                rem=x%10;
                rx=rx*10+rem;
                x/=10;
            }
        }
        if(rx==ox){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
	}
}
