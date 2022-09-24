# Java
For Practice

/*
input : n=1023
output: bacd
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s="";
		while(n!=0)
		{
		    s+=(char)((n%10)+97);
		    n/=10;
		}
		for(int i=s.length()-1;i>=0;i--)
		    System.out.print(s.charAt(i));
	}
}
