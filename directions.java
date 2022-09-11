# Java
For Practice

/*
If he can return back to the place where he starts after nth day, print “YES” else print “NO”.
Examples:
 

Input: str = “NNNWEWESSS” 
Output: Retruned Succesful

On the 1st, 2nd, and 3rd day he goes to north and on the 4th day he goes west, then eventually
returns where he was standing on the 3rd day on the 5th day, then on the 6th day he again goes to
west.On the 7th day he again return exactly to where he was standing on the 5th day.And on the
10th day he returns home safely.

Input: str = “NW” 
Output: Not Returned Sucessful
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int a=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='N'){
		        a=a+1;
		    }
		    else if(str.charAt(i)=='S'){
		        a=a-1;
		    }
		    else if(str.charAt(i)=='E'){
		        a=a-2;
		    }
		    else{
		        a=a+2;
		    }
		}
		if(a==0){
		    System.out.println("Retruned Succesful");
		}else{
		    System.out.println("Not Returned Sucessful");
		}
	}
}

