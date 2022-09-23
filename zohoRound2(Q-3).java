# Java
For Practice

/*
input : n = 7
        arr[]={1,1,2,3,4,4,5}
        
output: 1(2) 2(1) 3(1) 4(2) 5(1)
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
		int res[]=new int[n];
		int visited=-1;
		for(int i=0;i<n;i++){
		    int count=1;
		    for(int j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            count++;
		            res[j]=visited;
		        }
		    }
		    if(res[i]!=visited){
		        res[i]=count;
		    }
		}
		for(int i=0;i<n;i++){
		    if(res[i]!=visited && i==0){
		        System.out.printf("%d(%d)",arr[i],res[i]);
		        continue;
		    }
		    if(res[i]!=visited){    
		        System.out.printf(" "+"%d(%d)", arr[i],res[i]);
		    }
		}
	}
}

