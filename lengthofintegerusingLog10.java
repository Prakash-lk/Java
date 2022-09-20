# Java
For Practice

/*
input : num = 1324
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
	    int len=0;
		len=(int) Math.log10(num)+1;
		System.out.println(len);
	}
}
