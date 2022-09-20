# Java
For Practice

/*
input : num = 1243
output: 4

explanation : Here the length of the num is 4.
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int rem=0,len=0;
		while(num!=0)
		{
		    rem=num%10;
		    num/=10;
		    len++;
		}
		System.out.println(len);
	}
}
