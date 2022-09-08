# Java
For Practice

/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]*/

#java

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        int res1=-1;
        int res2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target&&res1==-1){
                res1=i;
            }
            if(nums[i]==target){
                res2=i;
            }
        }
        res[0]=res1;
        res[1]=res2;
        return res;
    }
}
