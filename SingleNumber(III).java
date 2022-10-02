# Java
For Practice

/*
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

Example 2:

Input: nums = [-1,0]
Output: [-1,0]

Example 3:

Input: nums = [0,1]
Output: [1,0]
*/

#java

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);//1 1 2 2 3 5
        int k=0,p=-1;
        int a[]=new int[2];
        for(int i=0;i<nums.length;i=i+2)
        {
            if(nums[i]!=nums[i+1]){
                a[0]=nums[i];
                k=i;
                break;
            }
        }
        for(int i=k+1;i<nums.length-1;i=i+2)
        {
            if(nums[i]!=nums[i+1]){
                p=nums[i];
                break;
            }
        }
        if(p==-1)
        {
            a[1]=nums[nums.length-1];
        }else{
            a[1]=p;
        }
        return a;
    }
}
