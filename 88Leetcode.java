# Java
For Practice

/*Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
 
 #java
 
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int m=in.nextInt();
	    int nums1[]=new int[m];
	    for(int i=0;i<m;i++){
	        nums1[i]=in.nextInt();
	    }
	    int n=in.nextInt();
	    int nums2[]=new int[n];
	    for(int i=0;i<n;i++){
	        nums2[i]=in.nextInt();
	    }
		int j=(m+n)-1;
        for(int i=0;i<n;i++){
            if(nums1[j]==0){
                nums1[j]=nums2[i];
                j--;
            }
        }
        Arrays.sort(nums1);
	}
}

