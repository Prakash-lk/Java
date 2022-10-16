# Java
For Practice

/*
input : arr[]={4,2,4,1,5,5,1,3};

output: {1=2, 2=1, 3=1, 4=2, 5=2}

*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={4,2,4,1,5,5,1,3};
		HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freq);
	}
}
