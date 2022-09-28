# Java
For Practice

/*
input : s="abcdacba"

output: a3
        b2
        c2
        d1
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
		//String s="abcdacba";
		int arr[]=new int[s.length()];
		char a[]=s.toCharArray();
		int cnt=1;
		for(int i=0;i<a.length;i++){
		    cnt=1;
		    for(int j=i+1;j<a.length;j++){
		        if(a[i]==a[j]){
		            cnt++;
		          a[j]='#';
		        }
		    }
		    arr[i]=cnt;
		}
		for(int i=0;i<a.length;i++){
		    if(a[i]!='#'){
		        System.out.println(a[i]+""+arr[i]);
		    }
		}
	}
}

