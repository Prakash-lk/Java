# Java
For Practice

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String temp=Integer.toString(num);
		int arr[]=new int[temp.length()];
		for(int i=0;i<temp.length();i++){
		    arr[i]=temp.charAt(i)-'0';
		}
		for(int i=0;i<temp.length();i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
