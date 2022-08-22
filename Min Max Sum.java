# Java
For Practice

/*Challenge Name: Min Max Sum

Problem
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format
A single line of five space-separated integers.

Constraints
Each integer is in the inclusive range (1,109).

Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        long arr[]=new long[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=in.nextLong();
        }
        Arrays.sort(arr);
        long min=0,max=0;
        for(int i=0;i<4;i++)
        {
            min+=arr[i];
        }
        for(int i=1;i<5;i++)
        {
            max+=arr[i];
        }
        System.out.println(min+" "+max);
    }
}
