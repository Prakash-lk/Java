# Java
For Practice

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

#java

class Solution {
    public int majorityElement(int[] nums) {
        int cnt[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            cnt[i]=count;
        }
        int maxi=cnt[0];
        for(int i=1;i<cnt.length;i++){
            if(maxi<cnt[i]){
                maxi=cnt[i];
            }
        }
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(cnt[i],nums[i]);
        }
        
        return res.get(maxi);
    }
}
