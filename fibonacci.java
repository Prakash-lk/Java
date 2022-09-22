# Java
For Practice

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int fInd=0,sInd=1;
		for(int i=1;i<=n;i++){
		    System.out.print(fInd+" ");
		    int nInd=fInd+sInd;
		   fInd=sInd;
		    sInd=nInd;
		}
	}
}
