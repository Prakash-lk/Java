# Java
For Practice

/*
Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

Example 1:

Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:

Input: nums = [-1]
Output: [0]
Example 3:

Input: nums = [-1,-1]
Output: [0,0]
*/

#java

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>(nums.length);
        int cnt=0,z=0,c=0;
        for(int i=0;i<nums.length-1;i++){
            cnt=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    cnt++;
                }
            }
            arr.add(cnt);
            
        }
        arr.add(c);
        //List al = Arrays.asList(arr);
        return arr;
    }
}
