# Java
For Practice
/* 6 — Value of N.
Input: [6,0,1,8,0,2]

Output: 6 1 8 2 0 0 */

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i< n;i++)
                  arr[i]=n.nextInt();
            int count=0;
            for(int i=0;i< n;i++)
                if(arr[i]!=0)
                    arr[count++]=arr[i];
             for(int i=count;i < n;i++)
                 arr[i]=0;
             for(int i=0;i< n;i++)
                    System.out.print(arr[i]+" ");
    }
}
