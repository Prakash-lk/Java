# Java
For Practice

/*
input : s = "abaccdce"

output: 3

Explanation : Here 'b','d','e' are the characters are comes once in a String. So the output will be 3.
*/

#java

import java.util.*;
class Main {
    public static void main(String args[]) 
    {
        Scanner in= new Scanner(System.in);
        String a = in.nextLine();
        int count=0,z=0,cnt=0;
        int arr[]=new int[a.length()];
        int arrcnt[]=new int[a.length()];
        for(int i=0;i<a.length();i++){
            count=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
            arrcnt[z++]=count;
        }
        for(int i=0;i<a.length();i++){
            if(arrcnt[i]==1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
