# Java
For Practice

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/

#java

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for(int i= 0;i<nums.length;i++){
            visited[nums[i]-1] = true;
        }
        for(int i= 0;i<visited.length;i++){
            if(!visited[i]){
                res.add(i+1);
            }
        }
        return res;
    }
}
