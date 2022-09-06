# Java
For Practice


/*Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.5
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/



/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=in.nextInt();
	    int nums1[]=new int[N];
	    for(int i=0;i<N;i++){
	        nums1[i]=in.nextInt();
	    }
	    int M=in.nextInt();
	    int nums2[]=new int[M];
	    for(int i=0;i<M;i++){
	        nums2[i]=in.nextInt();
	    }
		int m=nums1.length; 
        int n=nums2.length;
        int[]nums =new int[m+n];
        for(int i=0;i<m;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums[m+i]=nums2[i];
        }
        Arrays.sort(nums);
        int a=nums.length;
        if(a%2==0)      System.out.println((nums[(a/2)-1]+nums[a/2])/2.0);
        else            System.out.println(nums[a/2]);

	}
}
