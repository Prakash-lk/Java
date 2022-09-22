# Java
For Practice

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean flg=true;
		for(int i=2;i*i<=n;i++){
		    if(n%i==0){
		        flg=false;
		    }
		}
		if(flg){
		    System.out.println("Prime");
		}
		else{
		    System.out.println("Not a prime");
		}
	}
}
