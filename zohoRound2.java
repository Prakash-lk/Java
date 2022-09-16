# Java
For Practice

/*
Note : The input will be given in odd number only.

Input : 5
     
     5     1
      4   2
        3
      2   4
     1     5
*/

#java

import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int mid=(N+1)/2;
		for(int i=1;i<=N;i++)
		{
		    for(int j=1;j<=N;j++)
		    {
		        if(i==j)
		        {
		            if(i<mid)
		            {
		                System.out.print(N-i+1+"  ");
		            }
		            else
		            {
		                System.out.print(i+"  ");
		            }
		        }
		        else if(i+j==(N+1))
		        {
		            if(i<mid)
		            {
		                System.out.print(i+"  ");
		            }
		            else
		            {
		                System.out.print(j+"  ");
		            }
		        }
		        else
		        {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		    System.out.println();
		}
	}
}
