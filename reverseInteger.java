# Java
For Practice

/*
Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int temp=x;
        long sum=0;
        if(temp<0)
        temp=-(x);
        while(temp>0){
            int r=temp%10;
            sum=sum*10+r;
            temp/=10;
        }
        if(sum<=2147483647 && sum>=0 ){
            if(x>0)
                System.out.println((int)sum);
            else
                System.out.println((int)-(sum)); 
        }
        else
            System.out.println(0); 
	}
}

