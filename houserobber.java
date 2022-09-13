# Java
For Practice

/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int nums[]=new int[N];
		for(int i=0;i<N;i++){
		    nums[i]=in.nextInt();
		}
		if(nums.length==0)  System.out.println(0);
        if(nums.length==1)  System.out.println(nums[0]);
        int res[]=new int[nums.length];
        res[0]=nums[0];
        res[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            res[i]=Math.max(res[i-1],res[i-2]+nums[i]);
        }
            System.out.println(res[nums.length-1]);
	}
}
