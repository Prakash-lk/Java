# Java
For Practice

/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/

#java

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean flg=true;
		HashMap<Integer,Integer> map=new HashMap<>();
		ArrayList res=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> i : map.entrySet()){
		    res.add(i.getValue());
		}
		//System.out.println(res);
		Collections.sort(res);
		for(int i=1;i<res.size();i++){
		    if(res.get(i)!=res.get(i-1)){
		        flg=true;
		    }
		    else{
		        flg=false;
		        break;
		    }
		}
        return flg;  
    }
}
