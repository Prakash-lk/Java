Problem statement
You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.

Your task is to count the frequency of all elements from 1 to n.

Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]    
Output: [2, 1, 1, 0, 0, 0]
Explanation: Below Table shows the number and their counts, respectively, in the array
Number         Count 
 1                2
 2                1
 3                1
 4                0
 5                0
 6                0

#Code
  import java.util.*;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        //Write your code here.
        int res[]=new int[n];
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            ans.add(freq.get(i+1));
        }
        for (int i = 0; i < n; i++) {
            if (ans.get(i) == null) {
                res[i] = 0;
            } else {
                res[i] = ans.get(i);
            }
        }
        return res;
    }
}
