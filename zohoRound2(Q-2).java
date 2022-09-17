# Java
For Practice

/*
Example - 1:
input : N=9;
        arr[]={1 ,2, 3, 4, 5, 6, 7, 8, 9};
       
output : {1 8 7 6 5 4 3 2 9}

Example - 2:
input : N=8;
        arr[]={1 ,2, 3, 4, 5, 6, 7, 8};
       
output : {1 7 6 5 4 3 2 8}
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=in.nextInt();
		}
		int st=1,ed=arr.length-2;
		while(st<=ed){
		    int temp=arr[st];
		    arr[st]=arr[ed];
		    arr[ed]=temp;
		    st++;
		    ed--;
		}
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
