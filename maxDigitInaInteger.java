# Java
For Practice

/*
Print the Maximum digit in a Number

Example 1:-
input : n = 53461

output: 6

Example 2:-
input : n=72341

output: 7
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int maxi=0,mod=0;
		while(n!=0){
		    mod=n%10;
		    if(mod>maxi){
		        maxi=mod;
		    }
		    n/=10;
		}
		System.out.println(maxi);
	}
}
