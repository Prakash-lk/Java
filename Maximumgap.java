# Java
For Practice

/*Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=in.nextInt();
	    int nums[]=new int[N];
	    for(int i=0;i<N;i++){
	        nums[i]=in.nextInt();
	    }
	    ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);                                      //1 3 6 9
        if(nums.length==0 || nums.length==1) System.out.println(0);
        for(int i=1;i<nums.length;i++){
            arr.add(nums[i]-nums[i-1]);
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
	}
}

