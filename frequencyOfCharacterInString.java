# Java
For Practice

/*
input : str = "prakash"

output: p(1) r(1) a(2) k(1) s(1) h(1)
*/

#java

import java.util.*;
public class Main  
{  
     public static void main(String[] args) 
     {  
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        //String str="prakash";  
        int[] freq=new int[str.length()];  
        char str1[]=str.toCharArray();            
        for(int i=0;i<str.length();i++) 
        {  
            freq[i]=1;  
            for(int j=i+1;j<str.length();j++) 
            {  
                if(str1[i]==str1[j])
                {  
                    freq[i]++;  
                    str1[j] = '#';  
                }  
            }  
        }            
        for(int i=0;i<freq.length;i++) 
        {  
            if(str1[i]!='#')  
                System.out.printf("%s(%d) ",str1[i],freq[i]);  
        }  
    }  
}  
