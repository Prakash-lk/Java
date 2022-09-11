# Java
For Practice

/*
input1: HAI HELLO
output: 442444 0 4433555555666
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		String arr[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String space="";
        int ind;
        for(int i=0;i<a.length();i++)
        if(a.charAt(i)>='A' && a.charAt(i)<='Z' || a.charAt(i)==' '){
            if(a.charAt(i)==' '){
                space=space+" 0 ";
            }else{
                ind=a.charAt(i)-'A';
                space=space+arr[ind];
            }
        }
        System.out.println(space);
	}
}
