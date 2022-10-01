# Java
For Practice

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int res[]=new int[nums.length];
        int cnt=1,vis=-1;
        HashMap<Integer,Integer> ans=new HashMap<>();
		for(int i=0;i<nums.length;i++){
		    cnt=1;
		    for(int j=i+1;j<nums.length;j++){
		        if(nums[i]==nums[j]){
		            cnt++;
		            res[j]=vis;
		        }
		    }
		    if(res[i]!=vis){
		        res[i]=cnt;
		    }
		}
		for(int i=0;i<nums.length;i++){
		    ans.put(res[i],nums[i]);
		}
		System.out.println(ans.get(1));
	}
}
