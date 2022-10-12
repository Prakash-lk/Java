# Java
For Practice

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
*/

#java

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans =new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet() ){
            if(map.get(i)>nums.length/3 ){
                ans.add(i);
            }
        }
        return ans;
    }
}
