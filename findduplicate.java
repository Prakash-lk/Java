# Java
For Practice

/* 
Example 1:
Input: N=8, nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: N=3, nums = [1,1,2]
Output: [1]

Example 3:
Input: N=1, nums = [1]
Output: []
*/

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int nums[]=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=in.nextInt();     
        }
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                res.add(nums[i]);
            }
        }
        System.out.println(res);
    }
}
