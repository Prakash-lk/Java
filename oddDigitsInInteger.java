# Java
For Practice

/*
input : n=12345

output: 3

input : n=53242

output: 2
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int res=0,cnt=0;
		while(n>0){
		    res=n%10;
		    if(res%2!=0){
		        cnt++;
		    }
		    n/=10;
		}
		System.out.println(cnt);
	}
}

