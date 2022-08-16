# Java
For Practice

/* aabcccccaaa  --> a2b1c5a3 */

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    HashMap<Character,Integer> mp=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      int n=mp.get(s.charAt(i));
      mp.put(s.charAt(i),n+1);
    }
    else
    {
     mp.put(s.charAt(i),1);
    }
    for(Character i:mp.keySet())
    {
    char j=i;
    System.out.print(j+""+mp.get(i));
    }
  }
}
