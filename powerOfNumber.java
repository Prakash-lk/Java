# Java
For Practice

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int x=in.nextInt();
	    int n=in.nextInt();
		int pow=1;
		while(n!=0){
		    pow*=x;
		    n--;
		}
		System.out.println(pow);
	}
}
