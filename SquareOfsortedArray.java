# Java
For Practice

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int m=in.nextInt();
	    int nums[]=new int[m];
	    for(int i=0;i<m;i++){
	        nums[i]=in.nextInt();
	    }
	    int a;
	    for(int i=0;i<m;i++){
            a=nums[i];
            a*=a;
            nums[i]=a;
        }
        Arrays.sort(nums);
        for(int i=0;i<m;i++){
            System.out.print(nums[i]+" ");
        }
	}
}

