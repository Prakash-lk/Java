# Java
For Practice

/*
Sort a array without using sort(),

input : n=5
        arr[]={4,3,5,2,1}
        
output: {1 2 3 4 5}
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(arr[i]>arr[j]){
		            int tmp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=tmp;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
