# Java
For Practice

/*
input : s="cat is the matter of cat in matter"

output: Repeated words are : cat matter
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    System.out.print("Repeated words are : ");
		  //String s="cat is the matter of cat in matter";
		  String arr[]=s.split(" ");
		  for(int i=0;i<arr.length;i++){
		      for(int j=i+1;j<arr.length;j++){
		          if(arr[i].equals(arr[j]))
		              System.out.print(arr[i]+" ");
		      }
		  }
	 }
}
