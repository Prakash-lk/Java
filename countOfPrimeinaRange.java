# Java
For Practice

/*
Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 0
*/

#java
//Using Sieve of Eratosthenes algorithm

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int cnt=0;
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++){
		    arr[i]=1;
		}
		arr[0]=0;
		arr[1]=0;
		for(int i=2;i*i<=n;i++){
		    for(int j=i*i;j<=n;j+=i){
		        arr[j]=0;
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]==1){
		        cnt++;
		    }
		}
		System.out.println(cnt);
	}
}
