# Java
For Practice

/*      Input:
        Array 1: 1,2,3,4,5
        Array 2: 6,7,8
        Output:
        Merged array: 1,2,3,4,5,6,7,8
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr1[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr1[i]=in.nextInt();
	    }
	    int N=in.nextInt();
	    int arr2[]=new int[N];
	    for(int i=0;i<N;i++){
	        arr2[i]=in.nextInt();
	    }
      //Code starts here
      
	    int len=arr1.length+arr2.length;
	    int mergedarr[]=new int[len];
	    for(int i=0;i<n;i++){
	        mergedarr[i]=arr1[i];
	    }
	    for(int i=0;i<N;i++){
	        mergedarr[arr1.length+i]=arr2[i];
	    }
	    for(int i=0;i<len;i++){
	        System.out.print(mergedarr[i]+" ");
	    }
	}
}
