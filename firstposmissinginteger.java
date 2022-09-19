# Java
For Practice

/*
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
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
		int ans = 0;
        int len = nums.length;
        if(len==1){
            if(nums[0]<=0){
                System.out.println(1);
            }
            else if(nums[0]==1){
                System.out.println(2);
            }
        }
        int [] arr = new int[len+1];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=0 && nums[i]<=arr.length-1){
                arr[nums[i]]++;
            }
        }
        int count = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>0){
                count++;
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        if(count==len){
            ans = count+1;
        }
        System.out.println(ans);
	}
}

