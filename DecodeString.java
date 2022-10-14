/* Eg 1: Input: a1b5
         Output: abbbbb
Eg: 2: Input: b3c6d1
       Output: bbbccccccd */
       
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String res="";
		for(int i=1;i<s.length();i=i+2)
		{
		    for(int j=0;j<s.charAt(i)-'0';j++)
		    {
		        res+=s.charAt(i-1);
		    }
		}
		System.out.println(res);
	}
}
